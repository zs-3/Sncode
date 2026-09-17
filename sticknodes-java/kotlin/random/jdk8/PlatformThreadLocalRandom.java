package kotlin.random.jdk8;

/* compiled from: PlatformThreadLocalRandom.kt */
/* loaded from: classes2.dex */
public final class PlatformThreadLocalRandom extends kotlin.random.AbstractPlatformRandom {
    public PlatformThreadLocalRandom() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlin.random.AbstractPlatformRandom
    public java.util.Random getImpl() {
            r2 = this;
            java.util.concurrent.ThreadLocalRandom r0 = java.util.concurrent.ThreadLocalRandom.current()
            java.lang.String r1 = "current()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }
}
