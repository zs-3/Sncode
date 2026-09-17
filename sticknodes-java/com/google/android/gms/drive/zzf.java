package com.google.android.gms.drive;

/* loaded from: classes.dex */
final class zzf extends com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.drive.zzaw, com.google.android.gms.drive.Drive.zzb> {
    zzf() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ com.google.android.gms.common.api.Api.Client buildClient(android.content.Context r9, android.os.Looper r10, com.google.android.gms.common.internal.ClientSettings r11, com.google.android.gms.drive.Drive.zzb r12, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r13, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r14) {
            r8 = this;
            com.google.android.gms.drive.Drive$zzb r12 = (com.google.android.gms.drive.Drive.zzb) r12
            com.google.android.gms.internal.drive.zzaw r7 = new com.google.android.gms.internal.drive.zzaw
            if (r12 != 0) goto L15
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r13
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        L15:
            java.lang.NoSuchMethodError r9 = new java.lang.NoSuchMethodError
            r9.<init>()
            throw r9
    }
}
