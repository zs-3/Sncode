package androidx.datastore.core;

/* compiled from: SingleProcessDataStore.kt */
/* loaded from: classes.dex */
final class Data<T> extends androidx.datastore.core.State<T> {
    private final int hashCode;
    private final T value;

    public Data(T r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r1.value = r2
            r1.hashCode = r3
            return
    }

    public final void checkHashCode() {
            r3 = this;
            T r0 = r3.value
            r1 = 0
            if (r0 == 0) goto La
            int r0 = r0.hashCode()
            goto Lb
        La:
            r0 = 0
        Lb:
            int r2 = r3.hashCode
            if (r0 != r2) goto L10
            r1 = 1
        L10:
            if (r1 == 0) goto L13
            return
        L13:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Data in DataStore was mutated but DataStore is only compatible with Immutable types."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final T getValue() {
            r1 = this;
            T r0 = r1.value
            return r0
    }
}
