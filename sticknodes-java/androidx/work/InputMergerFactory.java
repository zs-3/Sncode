package androidx.work;

/* loaded from: classes.dex */
public abstract class InputMergerFactory {


    public InputMergerFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.work.InputMergerFactory getDefaultInputMergerFactory() {
            androidx.work.InputMergerFactory$1 r0 = new androidx.work.InputMergerFactory$1
            r0.<init>()
            return r0
    }

    public abstract androidx.work.InputMerger createInputMerger(java.lang.String r1);

    public final androidx.work.InputMerger createInputMergerWithDefaultFallback(java.lang.String r2) {
            r1 = this;
            androidx.work.InputMerger r0 = r1.createInputMerger(r2)
            if (r0 != 0) goto La
            androidx.work.InputMerger r0 = androidx.work.InputMerger.fromClassName(r2)
        La:
            return r0
    }
}
