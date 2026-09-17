package kotlin.random;

/* compiled from: PlatformRandom.kt */
/* loaded from: classes2.dex */
public final class FallbackThreadLocalRandom extends kotlin.random.AbstractPlatformRandom {
    private final kotlin.random.FallbackThreadLocalRandom$implStorage$1 implStorage;

    public FallbackThreadLocalRandom() {
            r1 = this;
            r1.<init>()
            kotlin.random.FallbackThreadLocalRandom$implStorage$1 r0 = new kotlin.random.FallbackThreadLocalRandom$implStorage$1
            r0.<init>()
            r1.implStorage = r0
            return
    }

    @Override // kotlin.random.AbstractPlatformRandom
    public java.util.Random getImpl() {
            r2 = this;
            kotlin.random.FallbackThreadLocalRandom$implStorage$1 r0 = r2.implStorage
            java.lang.Object r0 = r0.get()
            java.lang.String r1 = "implStorage.get()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.util.Random r0 = (java.util.Random) r0
            return r0
    }
}
