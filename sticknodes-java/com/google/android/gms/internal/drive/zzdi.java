package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzdi {
    private com.google.android.gms.drive.events.OnChangeListener zzgg;
    private com.google.android.gms.internal.drive.zzee zzgh;
    private com.google.android.gms.drive.DriveId zzk;

    zzdi(com.google.android.gms.internal.drive.zzch r3, com.google.android.gms.drive.events.OnChangeListener r4, com.google.android.gms.drive.DriveId r5) {
            r2 = this;
            r2.<init>()
            r0 = 1
            boolean r1 = com.google.android.gms.drive.events.zzj.zza(r0, r5)
            com.google.android.gms.common.internal.Preconditions.checkState(r1)
            r2.zzgg = r4
            r2.zzk = r5
            com.google.android.gms.internal.drive.zzee r5 = new com.google.android.gms.internal.drive.zzee
            android.os.Looper r1 = r3.getLooper()
            android.content.Context r3 = r3.getApplicationContext()
            r4.getClass()
            com.google.android.gms.drive.events.ChangeListener r4 = com.google.android.gms.internal.drive.zzdj.zza(r4)
            r5.<init>(r1, r3, r0, r4)
            r2.zzgh = r5
            r5.zzf(r0)
            return
    }

    static /* synthetic */ com.google.android.gms.internal.drive.zzee zza(com.google.android.gms.internal.drive.zzdi r0) {
            com.google.android.gms.internal.drive.zzee r0 = r0.zzgh
            return r0
    }
}
