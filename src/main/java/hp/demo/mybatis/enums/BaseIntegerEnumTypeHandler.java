package hp.demo.mybatis.enums;

import hp.demo.mybatis.enums.IntegerEnum;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * MyBatis映射枚举类型的TypeHandler
 *
 * @param <E> 枚举类型，要继承IntegerEnum
 */
public abstract class BaseIntegerEnumTypeHandler<E extends Enum<?> & IntegerEnum> extends BaseTypeHandler<E> {

	protected Class<E> type;

	protected final E[] enums;

	public BaseIntegerEnumTypeHandler(Class<E> type) {  // 若没有在本handler类上加注解MappedJdbcTypes和MappedTypes，则ResultMap中需要指定类型。
		if (type == null) {
			throw new IllegalArgumentException("type can not be null");
		}
		this.type = type;
		this.enums = type.getEnumConstants();
		if (this.enums == null) {
			throw new IllegalArgumentException(type.getSimpleName() + " can not parse to IntegerEnum");
		}
	}

	private E valueOf(int value) {
		for (E e : enums) {
			if (e.getValue() == value) {
				return e;
			}
		}
		throw new IllegalArgumentException(type.getSimpleName() + " does not contain value: " + value);
	}


	/** Enum转int */
	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, E parameter, JdbcType jdbcType) throws SQLException {
		if (parameter == null) {
			ps.setObject(i, null);
		} else {
			ps.setInt(i, parameter.getValue());
		}
	}

	/** int转Enum */
	@Override
	public E getNullableResult(ResultSet rs, String columnName) throws SQLException {
		if (rs.getObject(columnName) == null) {
			return null;
		}
		return valueOf(rs.getInt(columnName));
	}

	/** int转Enum */
	@Override
	public E getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		if (rs.getObject(columnIndex) == null) {
			return null;
		}
		return valueOf(rs.getInt(columnIndex));
	}

	/** int转Enum */
	@Override
	public E getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		if (cs.getObject(columnIndex) == null) {
			return null;
		}
		return valueOf(cs.getInt(columnIndex));
	}
}
