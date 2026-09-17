package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzcq extends com.google.android.gms.common.api.internal.UnregisterListenerMethod<com.google.android.gms.internal.drive.zzaw, com.google.android.gms.internal.drive.zzdi> {
    private final /* synthetic */ com.google.android.gms.drive.DriveResource zzfq;
    private final /* synthetic */ com.google.android.gms.internal.drive.zzdi zzfr;

    zzcq(com.google.android.gms.internal.drive.zzch r1, com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey r2, com.google.android.gms.drive.DriveResource r3, com.google.android.gms.internal.drive.zzdi r4) {
            r0 = this;
            r0.zzfq = r3
            r0.zzfr = r4
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.UnregisterListenerMethod
    protected final /* synthetic */ void unregisterListener(com.google.android.gms.common.api.Api.AnyClient r4, com.google.android.gms.tasks.TaskCompletionSource r5) throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.internal.drive.zzaw r4 = (com.google.android.gms.internal.drive.zzaw) r4
            android.os.IInterface r4 = r4.getService()
            com.google.android.gms.internal.drive.zzeo r4 = (com.google.android.gms.internal.drive.zzeo) r4
            com.google.android.gms.internal.drive.zzgs r0 = new com.google.android.gms.internal.drive.zzgs
            com.google.android.gms.drive.DriveResource r1 = r3.zzfq
            com.google.android.gms.drive.DriveId r1 = r1.getDriveId()
            r2 = 1
            r0.<init>(r1, r2)
            com.google.android.gms.internal.drive.zzdi r1 = r3.zzfr
            com.google.android.gms.internal.drive.zzee r1 = com.google.android.gms.internal.drive.zzdi.zza(r1)
            com.google.android.gms.internal.drive.zzhq r2 = new com.google.android.gms.internal.drive.zzhq
            r2.<init>(r5)
            r5 = 0
            r4.zza(r0, r1, r5, r2)
            return
    }
}
