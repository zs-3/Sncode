package com.google.android.gms.common.data;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public abstract class EntityBuffer<T> extends com.google.android.gms.common.data.AbstractDataBuffer<T> {
    private boolean zaa;
    private java.util.ArrayList zab;

    @com.google.android.gms.common.annotation.KeepForSdk
    protected EntityBuffer(com.google.android.gms.common.data.DataHolder r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.zaa = r1
            return
    }

    private final void zab() {
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.zaa     // Catch: java.lang.Throwable -> L82
            if (r0 != 0) goto L80
            com.google.android.gms.common.data.DataHolder r0 = r7.mDataHolder     // Catch: java.lang.Throwable -> L82
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.common.data.DataHolder r0 = (com.google.android.gms.common.data.DataHolder) r0     // Catch: java.lang.Throwable -> L82
            int r0 = r0.getCount()     // Catch: java.lang.Throwable -> L82
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L82
            r1.<init>()     // Catch: java.lang.Throwable -> L82
            r7.zab = r1     // Catch: java.lang.Throwable -> L82
            r2 = 1
            if (r0 <= 0) goto L7e
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L82
            r1.add(r4)     // Catch: java.lang.Throwable -> L82
            java.lang.String r1 = r7.getPrimaryDataMarkerColumn()     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.common.data.DataHolder r4 = r7.mDataHolder     // Catch: java.lang.Throwable -> L82
            int r4 = r4.getWindowIndex(r3)     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.common.data.DataHolder r5 = r7.mDataHolder     // Catch: java.lang.Throwable -> L82
            java.lang.String r3 = r5.getString(r1, r3, r4)     // Catch: java.lang.Throwable -> L82
            r4 = 1
        L34:
            if (r4 >= r0) goto L7e
            com.google.android.gms.common.data.DataHolder r5 = r7.mDataHolder     // Catch: java.lang.Throwable -> L82
            int r5 = r5.getWindowIndex(r4)     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.common.data.DataHolder r6 = r7.mDataHolder     // Catch: java.lang.Throwable -> L82
            java.lang.String r6 = r6.getString(r1, r4, r5)     // Catch: java.lang.Throwable -> L82
            if (r6 == 0) goto L57
            boolean r5 = r6.equals(r3)     // Catch: java.lang.Throwable -> L82
            if (r5 != 0) goto L54
            java.util.ArrayList r3 = r7.zab     // Catch: java.lang.Throwable -> L82
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L82
            r3.add(r5)     // Catch: java.lang.Throwable -> L82
            r3 = r6
        L54:
            int r4 = r4 + 1
            goto L34
        L57:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L82
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L82
            r2.<init>()     // Catch: java.lang.Throwable -> L82
            java.lang.String r3 = "Missing value for markerColumn: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L82
            r2.append(r1)     // Catch: java.lang.Throwable -> L82
            java.lang.String r1 = ", at row: "
            r2.append(r1)     // Catch: java.lang.Throwable -> L82
            r2.append(r4)     // Catch: java.lang.Throwable -> L82
            java.lang.String r1 = ", for window: "
            r2.append(r1)     // Catch: java.lang.Throwable -> L82
            r2.append(r5)     // Catch: java.lang.Throwable -> L82
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L82
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L82
            throw r0     // Catch: java.lang.Throwable -> L82
        L7e:
            r7.zaa = r2     // Catch: java.lang.Throwable -> L82
        L80:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L82
            return
        L82:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L82
            throw r0
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    @com.google.android.gms.common.annotation.KeepForSdk
    public final T get(int r7) {
            r6 = this;
            r6.zab()
            int r0 = r6.zaa(r7)
            r1 = 0
            r2 = 1
            if (r7 < 0) goto L76
            java.util.ArrayList r3 = r6.zab
            int r3 = r3.size()
            if (r7 != r3) goto L14
            goto L76
        L14:
            java.util.ArrayList r3 = r6.zab
            int r3 = r3.size()
            int r3 = r3 + (-1)
            if (r7 != r3) goto L37
            com.google.android.gms.common.data.DataHolder r3 = r6.mDataHolder
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            com.google.android.gms.common.data.DataHolder r3 = (com.google.android.gms.common.data.DataHolder) r3
            int r3 = r3.getCount()
            java.util.ArrayList r4 = r6.zab
            java.lang.Object r4 = r4.get(r7)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            goto L51
        L37:
            java.util.ArrayList r3 = r6.zab
            int r4 = r7 + 1
            java.lang.Object r3 = r3.get(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.util.ArrayList r4 = r6.zab
            java.lang.Object r4 = r4.get(r7)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
        L51:
            int r3 = r3 - r4
            if (r3 != r2) goto L75
            int r7 = r6.zaa(r7)
            com.google.android.gms.common.data.DataHolder r3 = r6.mDataHolder
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            com.google.android.gms.common.data.DataHolder r3 = (com.google.android.gms.common.data.DataHolder) r3
            int r3 = r3.getWindowIndex(r7)
            java.lang.String r4 = r6.getChildDataMarkerColumn()
            if (r4 == 0) goto L73
            com.google.android.gms.common.data.DataHolder r5 = r6.mDataHolder
            java.lang.String r7 = r5.getString(r4, r7, r3)
            if (r7 != 0) goto L73
            goto L76
        L73:
            r1 = 1
            goto L76
        L75:
            r1 = r3
        L76:
            java.lang.Object r7 = r6.getEntry(r0, r1)
            return r7
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected java.lang.String getChildDataMarkerColumn() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @com.google.android.gms.common.annotation.KeepForSdk
    public int getCount() {
            r1 = this;
            r1.zab()
            java.util.ArrayList r0 = r1.zab
            int r0 = r0.size()
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected abstract T getEntry(int r1, int r2);

    @com.google.android.gms.common.annotation.KeepForSdk
    protected abstract java.lang.String getPrimaryDataMarkerColumn();

    final int zaa(int r4) {
            r3 = this;
            if (r4 < 0) goto L17
            java.util.ArrayList r0 = r3.zab
            int r0 = r0.size()
            if (r4 >= r0) goto L17
            java.util.ArrayList r0 = r3.zab
            java.lang.Object r4 = r0.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            return r4
        L17:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Position "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " is out of bounds for this buffer"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }
}
