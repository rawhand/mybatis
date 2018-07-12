package hp.demo.mybatis.entity;

import hp.demo.mybatis.enums.IntegerEnum;

public enum StatusEnum implements IntegerEnum {
    Valid((int) 10),
    Invalid((int) 11),
    Error((int) 66);

    private final int value;

    StatusEnum(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }

    public static StatusEnum findByValue(int value) {
        switch (value) {
            case 10:
                return Valid;
            case 11:
                return Invalid;
                default:
                    return Error;
        }
    }
}
