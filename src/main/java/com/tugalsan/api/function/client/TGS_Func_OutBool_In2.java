package com.tugalsan.api.function.client;

public interface TGS_Func_OutBool_In2<A, B> extends TGS_Func_OutTyped_In2<Boolean, A, B> {

    @Override
    default Boolean call(A input0, B input1) {
        return validate(input0, input1);
    }

    public boolean validate(A input0, B input1);
}
