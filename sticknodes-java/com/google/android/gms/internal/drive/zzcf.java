package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzcf implements com.google.android.gms.drive.DrivePreferencesApi.FileUploadPreferencesResult {
    private final com.google.android.gms.common.api.Status zzdy;
    private final com.google.android.gms.drive.FileUploadPreferences zzfm;

    private zzcf(com.google.android.gms.internal.drive.zzcb r1, com.google.android.gms.common.api.Status r2, com.google.android.gms.drive.FileUploadPreferences r3) {
            r0 = this;
            r0.<init>()
            r0.zzdy = r2
            r0.zzfm = r3
            return
    }

    /* synthetic */ zzcf(com.google.android.gms.internal.drive.zzcb r1, com.google.android.gms.common.api.Status r2, com.google.android.gms.drive.FileUploadPreferences r3, com.google.android.gms.internal.drive.zzcc r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // com.google.android.gms.drive.DrivePreferencesApi.FileUploadPreferencesResult
    public final com.google.android.gms.drive.FileUploadPreferences getFileUploadPreferences() {
            r1 = this;
            com.google.android.gms.drive.FileUploadPreferences r0 = r1.zzfm
            return r0
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
            r1 = this;
            com.google.android.gms.common.api.Status r0 = r1.zzdy
            return r0
    }
}
