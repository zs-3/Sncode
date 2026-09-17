package com.google.android.gms.internal.drive;

@java.lang.Deprecated
/* loaded from: classes.dex */
public final class zzcb implements com.google.android.gms.drive.DrivePreferencesApi {
    public zzcb() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.drive.DrivePreferencesApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DrivePreferencesApi.FileUploadPreferencesResult> getFileUploadPreferences(com.google.android.gms.common.api.GoogleApiClient r2) {
            r1 = this;
            com.google.android.gms.internal.drive.zzcc r0 = new com.google.android.gms.internal.drive.zzcc
            r0.<init>(r1, r2)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r2 = r2.enqueue(r0)
            return r2
    }

    @Override // com.google.android.gms.drive.DrivePreferencesApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> setFileUploadPreferences(com.google.android.gms.common.api.GoogleApiClient r2, com.google.android.gms.drive.FileUploadPreferences r3) {
            r1 = this;
            boolean r0 = r3 instanceof com.google.android.gms.internal.drive.zzei
            if (r0 == 0) goto L10
            com.google.android.gms.internal.drive.zzei r3 = (com.google.android.gms.internal.drive.zzei) r3
            com.google.android.gms.internal.drive.zzcd r0 = new com.google.android.gms.internal.drive.zzcd
            r0.<init>(r1, r2, r3)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r2 = r2.execute(r0)
            return r2
        L10:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Invalid preference value"
            r2.<init>(r3)
            throw r2
    }
}
