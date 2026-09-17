package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzho extends com.google.android.gms.internal.drive.zzhh<com.google.android.gms.drive.MetadataBuffer> {
    public zzho(com.google.android.gms.tasks.TaskCompletionSource<com.google.android.gms.drive.MetadataBuffer> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.internal.drive.zzfv r3) throws android.os.RemoteException {
            r2 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = r2.zzay()
            com.google.android.gms.drive.MetadataBuffer r1 = new com.google.android.gms.drive.MetadataBuffer
            com.google.android.gms.common.data.DataHolder r3 = r3.zzav()
            r1.<init>(r3)
            r0.setResult(r1)
            return
    }
}
