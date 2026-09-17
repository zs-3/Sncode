package com.google.android.gms.drive;

@java.lang.Deprecated
/* loaded from: classes.dex */
public class OpenFileActivityBuilder {
    public static final java.lang.String EXTRA_RESPONSE_DRIVE_ID = "response_drive_id";
    private java.lang.String zzba;
    private java.lang.String[] zzbb;
    private com.google.android.gms.drive.query.Filter zzbc;
    private com.google.android.gms.drive.DriveId zzbd;

    public OpenFileActivityBuilder() {
            r0 = this;
            r0.<init>()
            return
    }

    public android.content.IntentSender build(com.google.android.gms.common.api.GoogleApiClient r6) {
            r5 = this;
            boolean r0 = r6.isConnected()
            java.lang.String r1 = "Client must be connected"
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r1)
            r5.zzg()
            com.google.android.gms.drive.query.Filter r0 = r5.zzbc
            if (r0 != 0) goto L12
            r0 = 0
            goto L19
        L12:
            com.google.android.gms.drive.query.internal.FilterHolder r0 = new com.google.android.gms.drive.query.internal.FilterHolder
            com.google.android.gms.drive.query.Filter r1 = r5.zzbc
            r0.<init>(r1)
        L19:
            com.google.android.gms.common.api.Api$ClientKey<com.google.android.gms.internal.drive.zzaw> r1 = com.google.android.gms.drive.Drive.CLIENT_KEY     // Catch: android.os.RemoteException -> L37
            com.google.android.gms.common.api.Api$Client r6 = r6.getClient(r1)     // Catch: android.os.RemoteException -> L37
            com.google.android.gms.internal.drive.zzaw r6 = (com.google.android.gms.internal.drive.zzaw) r6     // Catch: android.os.RemoteException -> L37
            android.os.IInterface r6 = r6.getService()     // Catch: android.os.RemoteException -> L37
            com.google.android.gms.internal.drive.zzeo r6 = (com.google.android.gms.internal.drive.zzeo) r6     // Catch: android.os.RemoteException -> L37
            com.google.android.gms.internal.drive.zzgm r1 = new com.google.android.gms.internal.drive.zzgm     // Catch: android.os.RemoteException -> L37
            java.lang.String r2 = r5.zzba     // Catch: android.os.RemoteException -> L37
            java.lang.String[] r3 = r5.zzbb     // Catch: android.os.RemoteException -> L37
            com.google.android.gms.drive.DriveId r4 = r5.zzbd     // Catch: android.os.RemoteException -> L37
            r1.<init>(r2, r3, r4, r0)     // Catch: android.os.RemoteException -> L37
            android.content.IntentSender r6 = r6.zza(r1)     // Catch: android.os.RemoteException -> L37
            return r6
        L37:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Unable to connect Drive Play Service"
            r0.<init>(r1, r6)
            throw r0
    }

    final java.lang.String getTitle() {
            r1 = this;
            java.lang.String r0 = r1.zzba
            return r0
    }

    public com.google.android.gms.drive.OpenFileActivityBuilder setActivityStartFolder(com.google.android.gms.drive.DriveId r1) {
            r0 = this;
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.android.gms.drive.DriveId r1 = (com.google.android.gms.drive.DriveId) r1
            r0.zzbd = r1
            return r0
    }

    public com.google.android.gms.drive.OpenFileActivityBuilder setActivityTitle(java.lang.String r1) {
            r0 = this;
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.zzba = r1
            return r0
    }

    public com.google.android.gms.drive.OpenFileActivityBuilder setMimeType(java.lang.String[] r3) {
            r2 = this;
            if (r3 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            java.lang.String r1 = "mimeTypes may not be null"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            r2.zzbb = r3
            return r2
    }

    public com.google.android.gms.drive.OpenFileActivityBuilder setSelectionFilter(com.google.android.gms.drive.query.Filter r4) {
            r3 = this;
            r0 = 1
            if (r4 == 0) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = 0
        L6:
            java.lang.String r2 = "filter may not be null"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r1, r2)
            boolean r1 = com.google.android.gms.drive.query.internal.zzk.zza(r4)
            r0 = r0 ^ r1
            java.lang.String r1 = "FullTextSearchFilter cannot be used as a selection filter"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            r3.zzbc = r4
            return r3
    }

    final void zzg() {
            r2 = this;
            java.lang.String[] r0 = r2.zzbb
            if (r0 != 0) goto L9
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            r2.zzbb = r0
        L9:
            java.lang.String[] r0 = r2.zzbb
            int r0 = r0.length
            if (r0 <= 0) goto L1b
            com.google.android.gms.drive.query.Filter r0 = r2.zzbc
            if (r0 != 0) goto L13
            goto L1b
        L13:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot use a selection filter and set mimetypes simultaneously"
            r0.<init>(r1)
            throw r0
        L1b:
            return
    }

    final java.lang.String[] zzs() {
            r1 = this;
            java.lang.String[] r0 = r1.zzbb
            return r0
    }

    final com.google.android.gms.drive.query.Filter zzt() {
            r1 = this;
            com.google.android.gms.drive.query.Filter r0 = r1.zzbc
            return r0
    }

    final com.google.android.gms.drive.DriveId zzu() {
            r1 = this;
            com.google.android.gms.drive.DriveId r0 = r1.zzbd
            return r0
    }
}
