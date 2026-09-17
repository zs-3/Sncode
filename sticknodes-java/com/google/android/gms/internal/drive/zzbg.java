package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzbg extends com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.internal.drive.zzaw, android.content.IntentSender> {
    private final /* synthetic */ com.google.android.gms.drive.CreateFileActivityOptions zzer;

    zzbg(com.google.android.gms.internal.drive.zzbb r1, com.google.android.gms.drive.CreateFileActivityOptions r2) {
            r0 = this;
            r0.zzer = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r9, com.google.android.gms.tasks.TaskCompletionSource<android.content.IntentSender> r10) throws android.os.RemoteException {
            r8 = this;
            com.google.android.gms.internal.drive.zzaw r9 = (com.google.android.gms.internal.drive.zzaw) r9
            android.os.IInterface r0 = r9.getService()
            com.google.android.gms.internal.drive.zzeo r0 = (com.google.android.gms.internal.drive.zzeo) r0
            com.google.android.gms.drive.CreateFileActivityOptions r1 = r8.zzer
            com.google.android.gms.drive.metadata.internal.MetadataBundle r1 = r1.zzde
            android.content.Context r9 = r9.getContext()
            r1.zza(r9)
            com.google.android.gms.internal.drive.zzu r9 = new com.google.android.gms.internal.drive.zzu
            com.google.android.gms.drive.CreateFileActivityOptions r1 = r8.zzer
            com.google.android.gms.drive.metadata.internal.MetadataBundle r3 = r1.zzde
            java.lang.Integer r1 = r1.zzdk
            int r4 = r1.intValue()
            com.google.android.gms.drive.CreateFileActivityOptions r1 = r8.zzer
            java.lang.String r5 = r1.zzba
            com.google.android.gms.drive.DriveId r6 = r1.zzbd
            int r1 = r1.zzdl
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            android.content.IntentSender r9 = r0.zza(r9)
            r10.setResult(r9)
            return
    }
}
