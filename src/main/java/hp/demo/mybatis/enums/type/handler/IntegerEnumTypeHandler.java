package hp.demo.mybatis.enums.type.handler;

import hp.demo.mybatis.entity.StatusEnum;
import hp.demo.mybatis.enums.BaseIntegerEnumTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

@MappedJdbcTypes(JdbcType.INTEGER)
@MappedTypes(StatusEnum.class)
public class IntegerEnumTypeHandler extends BaseIntegerEnumTypeHandler {
    public IntegerEnumTypeHandler(Class type) {
        super(type);
    }
}
