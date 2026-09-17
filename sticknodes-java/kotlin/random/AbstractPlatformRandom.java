package kotlin.random;

/* compiled from: PlatformRandom.kt */
/* loaded from: classes2.dex */
public abstract class AbstractPlatformRandom extends kotlin.random.Random {
    public AbstractPlatformRandom() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract java.util.Random getImpl();

    @Override // kotlin.random.Random
    public int nextInt() {
            r1 = this;
            java.util.Random r0 = r1.getImpl()
            int r0 = r0.nextInt()
            return r0
    }
}
