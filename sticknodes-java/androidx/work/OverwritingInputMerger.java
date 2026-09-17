package androidx.work;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends androidx.work.InputMerger {
    public OverwritingInputMerger() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.work.InputMerger
    public androidx.work.Data merge(java.util.List<androidx.work.Data> r4) {
            r3 = this;
            androidx.work.Data$Builder r0 = new androidx.work.Data$Builder
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Iterator r4 = r4.iterator()
        Le:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L22
            java.lang.Object r2 = r4.next()
            androidx.work.Data r2 = (androidx.work.Data) r2
            java.util.Map r2 = r2.getKeyValueMap()
            r1.putAll(r2)
            goto Le
        L22:
            r0.putAll(r1)
            androidx.work.Data r4 = r0.build()
            return r4
    }
}
