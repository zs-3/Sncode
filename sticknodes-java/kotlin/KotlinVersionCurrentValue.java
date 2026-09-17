package kotlin;

/* compiled from: KotlinVersion.kt */
/* loaded from: classes2.dex */
final class KotlinVersionCurrentValue {
    public static final kotlin.KotlinVersionCurrentValue INSTANCE = null;

    static {
            kotlin.KotlinVersionCurrentValue r0 = new kotlin.KotlinVersionCurrentValue
            r0.<init>()
            kotlin.KotlinVersionCurrentValue.INSTANCE = r0
            return
    }

    private KotlinVersionCurrentValue() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final kotlin.KotlinVersion get() {
            kotlin.KotlinVersion r0 = new kotlin.KotlinVersion
            r1 = 1
            r2 = 8
            r3 = 22
            r0.<init>(r1, r2, r3)
            return r0
    }
}
