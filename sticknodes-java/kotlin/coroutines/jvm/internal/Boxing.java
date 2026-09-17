package kotlin.coroutines.jvm.internal;

/* compiled from: boxing.kt */
/* loaded from: classes2.dex */
public final class Boxing {
    public static final java.lang.Boolean boxBoolean(boolean r0) {
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    public static final java.lang.Integer boxInt(int r1) {
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            return r0
    }

    public static final java.lang.Long boxLong(long r1) {
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r1)
            return r0
    }
}
