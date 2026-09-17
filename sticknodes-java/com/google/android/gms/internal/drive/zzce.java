package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzce extends com.google.android.gms.internal.drive.zzl {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.drive.DrivePreferencesApi.FileUploadPreferencesResult> zzdx;
    private final /* synthetic */ com.google.android.gms.internal.drive.zzcb zzfk;

    private zzce(com.google.android.gms.internal.drive.zzcb r1, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.drive.DrivePreferencesApi.FileUploadPreferencesResult> r2) {
            r0 = this;
            r0.zzfk = r1
            r0.<init>()
            r0.zzdx = r2
            return
    }

    /* synthetic */ zzce(com.google.android.gms.internal.drive.zzcb r1, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder r2, com.google.android.gms.internal.drive.zzcc r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.common.api.Status r5) throws android.os.RemoteException {
            r4 = this;
            com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder<com.google.android.gms.drive.DrivePreferencesApi$FileUploadPreferencesResult> r0 = r4.zzdx
            com.google.android.gms.internal.drive.zzcf r1 = new com.google.android.gms.internal.drive.zzcf
            com.google.android.gms.internal.drive.zzcb r2 = r4.zzfk
            r3 = 0
            r1.<init>(r2, r5, r3, r3)
            r0.setResult(r1)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
    public final void zza(com.google.android.gms.internal.drive.zzfj r6) throws android.os.RemoteException {
            r5 = this;
            com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder<com.google.android.gms.drive.DrivePreferencesApi$FileUploadPreferencesResult> r0 = r5.zzdx
            com.google.android.gms.internal.drive.zzcf r1 = new com.google.android.gms.internal.drive.zzcf
            com.google.android.gms.internal.drive.zzcb r2 = r5.zzfk
            com.google.android.gms.common.api.Status r3 = com.google.android.gms.common.api.Status.RESULT_SUCCESS
            com.google.android.gms.internal.drive.zzei r6 = r6.zzhw
            r4 = 0
            r1.<init>(r2, r3, r6, r4)
            r0.setResult(r1)
            return
    }
}
