package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzje implements java.util.Comparator<com.google.android.gms.internal.drive.zzjc> {
    zzje() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(com.google.android.gms.internal.drive.zzjc r5, com.google.android.gms.internal.drive.zzjc r6) {
            r4 = this;
            com.google.android.gms.internal.drive.zzjc r5 = (com.google.android.gms.internal.drive.zzjc) r5
            com.google.android.gms.internal.drive.zzjc r6 = (com.google.android.gms.internal.drive.zzjc) r6
            java.util.Iterator r0 = r5.iterator()
            com.google.android.gms.internal.drive.zzjj r0 = (com.google.android.gms.internal.drive.zzjj) r0
            java.util.Iterator r1 = r6.iterator()
            com.google.android.gms.internal.drive.zzjj r1 = (com.google.android.gms.internal.drive.zzjj) r1
        L10:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L33
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L33
            byte r2 = r0.nextByte()
            int r2 = com.google.android.gms.internal.drive.zzjc.zzb(r2)
            byte r3 = r1.nextByte()
            int r3 = com.google.android.gms.internal.drive.zzjc.zzb(r3)
            int r2 = java.lang.Integer.compare(r2, r3)
            if (r2 == 0) goto L10
            return r2
        L33:
            int r5 = r5.size()
            int r6 = r6.size()
            int r5 = java.lang.Integer.compare(r5, r6)
            return r5
    }
}
