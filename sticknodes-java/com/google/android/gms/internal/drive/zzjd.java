package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzjd extends com.google.android.gms.internal.drive.zzjf {
    private final int limit;
    private int position;
    private final /* synthetic */ com.google.android.gms.internal.drive.zzjc zznu;

    zzjd(com.google.android.gms.internal.drive.zzjc r2) {
            r1 = this;
            r1.zznu = r2
            r1.<init>()
            r0 = 0
            r1.position = r0
            int r2 = r2.size()
            r1.limit = r2
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.position
            int r1 = r2.limit
            if (r0 >= r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.drive.zzjj
    public final byte nextByte() {
            r2 = this;
            int r0 = r2.position
            int r1 = r2.limit
            if (r0 >= r1) goto L11
            int r1 = r0 + 1
            r2.position = r1
            com.google.android.gms.internal.drive.zzjc r1 = r2.zznu
            byte r0 = r1.zzt(r0)
            return r0
        L11:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }
}
