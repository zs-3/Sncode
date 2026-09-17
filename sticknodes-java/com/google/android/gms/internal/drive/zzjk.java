package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzjk {
    private final byte[] buffer;
    private final com.google.android.gms.internal.drive.zzjr zznx;

    private zzjk(int r1) {
            r0 = this;
            r0.<init>()
            byte[] r1 = new byte[r1]
            r0.buffer = r1
            com.google.android.gms.internal.drive.zzjr r1 = com.google.android.gms.internal.drive.zzjr.zzb(r1)
            r0.zznx = r1
            return
    }

    /* synthetic */ zzjk(int r1, com.google.android.gms.internal.drive.zzjd r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public final com.google.android.gms.internal.drive.zzjc zzbx() {
            r2 = this;
            com.google.android.gms.internal.drive.zzjr r0 = r2.zznx
            r0.zzcb()
            com.google.android.gms.internal.drive.zzjm r0 = new com.google.android.gms.internal.drive.zzjm
            byte[] r1 = r2.buffer
            r0.<init>(r1)
            return r0
    }

    public final com.google.android.gms.internal.drive.zzjr zzby() {
            r1 = this;
            com.google.android.gms.internal.drive.zzjr r0 = r1.zznx
            return r0
    }
}
