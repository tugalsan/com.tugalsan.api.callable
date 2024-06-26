package com.tugalsan.api.function.client;

public class TGS_FuncUtils {

    public static <T> T Null() {
        return (T) null;
    }

    public static TGS_Func_OutTyped doNothing0() {
        return () -> Null();
    }

    public static TGS_Func_OutTyped_In1 doNothing1() {
        return w1 -> Null();
    }

    public static TGS_Func_OutTyped_In2 doNothing2() {
        return (w1, w2) -> Null();
    }

    public static TGS_Func_OutTyped_In3 doNothing3() {
        return (w1, w2, w3) -> Null();
    }

    public static TGS_Func_OutTyped_In4 doNothing4() {
        return (w1, w2, w3, w4) -> Null();
    }

    public static TGS_Func_OutTyped_In5 doNothing5() {
        return (w1, w2, w3, w4, w5) -> Null();
    }

    public static <R> TGS_Func toVoid(TGS_Func_OutTyped<R> call) {
        return () -> call.call();
    }

    public static <R> TGS_Func_OutTyped<R> toR(TGS_Func call) {
        return () -> {
            call.call();
            return null;
        };
    }

    public static <R, A> TGS_Func_In1<A> toVoid(TGS_Func_OutTyped_In1<R, A> call) {
        return a -> call.call(a);
    }

    public static <R, A> TGS_Func_OutTyped_In1<R, A> toR(TGS_Func_In1<A> call) {
        return a -> {
            call.call(a);
            return null;
        };
    }

    public static <R, A, B> TGS_Func_In2<A, B> toVoid(TGS_Func_OutTyped_In2<R, A, B> call) {
        return (a, b) -> call.call(a, b);
    }

    public static <R, A, B> TGS_Func_OutTyped_In2<R, A, B> toR(TGS_Func_In2<A, B> call) {
        return (a, b) -> {
            call.call(a, b);
            return null;
        };
    }

    public static <R, A, B, C> TGS_Func_In3<A, B, C> toVoid(TGS_Func_OutTyped_In3<R, A, B, C> call) {
        return (a, b, c) -> call.call(a, b, c);
    }

    public static <R, A, B, C> TGS_Func_OutTyped_In3<R, A, B, C> toR(TGS_Func_In3<A, B, C> call) {
        return (a, b, c) -> {
            call.call(a, b, c);
            return null;
        };
    }

    public static <R, A, B, C, D> TGS_Func_In4<A, B, C, D> toVoid(TGS_Func_OutTyped_In4<R, A, B, C, D> call) {
        return (a, b, c, d) -> call.call(a, b, c, d);
    }

    public static <R, A, B, C, D> TGS_Func_OutTyped_In4<R, A, B, C, D> toR(TGS_Func_In4<A, B, C, D> call) {
        return (a, b, c, d) -> {
            call.call(a, b, c, d);
            return null;
        };
    }

    public static <R, A, B, C, D, E> TGS_Func_In5<A, B, C, D, E> toVoid(TGS_Func_OutTyped_In5<R, A, B, C, D, E> call) {
        return (a, b, c, d, e) -> call.call(a, b, c, d, e);
    }

    public static <R, A, B, C, D, E> TGS_Func_OutTyped_In5<R, A, B, C, D, E> toR(TGS_Func_In5<A, B, C, D, E> call) {
        return (a, b, c, d, e) -> {
            call.call(a, b, c, d, e);
            return null;
        };
    }

}
