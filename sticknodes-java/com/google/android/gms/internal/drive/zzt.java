package com.google.android.gms.internal.drive;

@java.lang.Deprecated
/* loaded from: classes.dex */
public final class zzt {
    private java.lang.String zzba;
    private com.google.android.gms.drive.DriveId zzbd;
    private java.lang.Integer zzdk;
    private final int zzdl;
    private com.google.android.gms.drive.MetadataChangeSet zzdm;

    public zzt(int r1) {
            r0 = this;
            r0.<init>()
            r1 = 0
            r0.zzdl = r1
            return
    }

    public final android.content.IntentSender build(com.google.android.gms.common.api.GoogleApiClient r8) {
            r7 = this;
            boolean r0 = r8.isConnected()
            java.lang.String r1 = "Client must be connected"
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r1)
            r7.zzg()
            com.google.android.gms.common.api.Api$ClientKey<com.google.android.gms.internal.drive.zzaw> r0 = com.google.android.gms.drive.Drive.CLIENT_KEY
            com.google.android.gms.common.api.Api$Client r8 = r8.getClient(r0)
            com.google.android.gms.internal.drive.zzaw r8 = (com.google.android.gms.internal.drive.zzaw) r8
            com.google.android.gms.drive.MetadataChangeSet r0 = r7.zzdm
            com.google.android.gms.drive.metadata.internal.MetadataBundle r0 = r0.zzq()
            android.content.Context r1 = r8.getContext()
            r0.zza(r1)
            android.os.IInterface r8 = r8.getService()     // Catch: android.os.RemoteException -> L47
            com.google.android.gms.internal.drive.zzeo r8 = (com.google.android.gms.internal.drive.zzeo) r8     // Catch: android.os.RemoteException -> L47
            com.google.android.gms.internal.drive.zzu r6 = new com.google.android.gms.internal.drive.zzu     // Catch: android.os.RemoteException -> L47
            com.google.android.gms.drive.MetadataChangeSet r0 = r7.zzdm     // Catch: android.os.RemoteException -> L47
            com.google.android.gms.drive.metadata.internal.MetadataBundle r1 = r0.zzq()     // Catch: android.os.RemoteException -> L47
            java.lang.Integer r0 = r7.zzdk     // Catch: android.os.RemoteException -> L47
            int r2 = r0.intValue()     // Catch: android.os.RemoteException -> L47
            java.lang.String r3 = r7.zzba     // Catch: android.os.RemoteException -> L47
            com.google.android.gms.drive.DriveId r4 = r7.zzbd     // Catch: android.os.RemoteException -> L47
            r0 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch: android.os.RemoteException -> L47
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: android.os.RemoteException -> L47
            android.content.IntentSender r8 = r8.zza(r6)     // Catch: android.os.RemoteException -> L47
            return r8
        L47:
            r8 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Unable to connect Drive Play Service"
            r0.<init>(r1, r8)
            throw r0
    }

    public final int getRequestId() {
            r1 = this;
            java.lang.Integer r0 = r1.zzdk
            int r0 = r0.intValue()
            return r0
    }

    public final void zza(com.google.android.gms.drive.DriveId r1) {
            r0 = this;
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.android.gms.drive.DriveId r1 = (com.google.android.gms.drive.DriveId) r1
            r0.zzbd = r1
            return
    }

    public final void zza(com.google.android.gms.drive.MetadataChangeSet r1) {
            r0 = this;
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.android.gms.drive.MetadataChangeSet r1 = (com.google.android.gms.drive.MetadataChangeSet) r1
            r0.zzdm = r1
            return
    }

    public final com.google.android.gms.drive.MetadataChangeSet zzc() {
            r1 = this;
            com.google.android.gms.drive.MetadataChangeSet r0 = r1.zzdm
            return r0
    }

    public final void zzc(java.lang.String r1) {
            r0 = this;
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.zzba = r1
            return
    }

    public final com.google.android.gms.drive.DriveId zzd() {
            r1 = this;
            com.google.android.gms.drive.DriveId r0 = r1.zzbd
            return r0
    }

    public final void zzd(int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.zzdk = r1
            return
    }

    public final java.lang.String zze() {
            r1 = this;
            java.lang.String r0 = r1.zzba
            return r0
    }

    public final void zzg() {
            r2 = this;
            com.google.android.gms.drive.MetadataChangeSet r0 = r2.zzdm
            java.lang.String r1 = "Must provide initial metadata via setInitialMetadata."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
            java.lang.Integer r0 = r2.zzdk
            if (r0 != 0) goto Ld
            r0 = 0
            goto L11
        Ld:
            int r0 = r0.intValue()
        L11:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.zzdk = r0
            return
    }
}
