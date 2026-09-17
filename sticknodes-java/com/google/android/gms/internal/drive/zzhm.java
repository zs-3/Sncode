package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzhm extends com.google.android.gms.internal.drive.zzhh<com.google.android.gms.drive.TransferPreferences> {
    public zzhm(com.google.android.gms.tasks.TaskCompletionSource<com.google.android.gms.drive.TransferPreferences> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.internal.drive.zzfj r3) throws android.os.RemoteException {
            r2 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = r2.zzay()
            com.google.android.gms.drive.TransferPreferencesBuilder r1 = new com.google.android.gms.drive.TransferPreferencesBuilder
            com.google.android.gms.internal.drive.zzei r3 = r3.zzas()
            r1.<init>(r3)
            com.google.android.gms.drive.TransferPreferences r3 = r1.build()
            r0.setResult(r3)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.internal.drive.zzga r2) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = r1.zzay()
            com.google.android.gms.drive.TransferPreferences r2 = r2.zzax()
            r0.setResult(r2)
            return
    }
}
