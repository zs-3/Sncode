package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes.dex */
public final class zzf extends com.google.android.gms.common.internal.zza {
    public final android.os.IBinder zze;
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zzf;

    public zzf(com.google.android.gms.common.internal.BaseGmsClient r1, int r2, android.os.IBinder r3, android.os.Bundle r4) {
            r0 = this;
            r0.zzf = r1
            r0.<init>(r1, r2, r4)
            r0.zze = r3
            return
    }

    @Override // com.google.android.gms.common.internal.zza
    protected final void zzb(com.google.android.gms.common.ConnectionResult r2) {
            r1 = this;
            com.google.android.gms.common.internal.BaseGmsClient r0 = r1.zzf
            com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener r0 = com.google.android.gms.common.internal.BaseGmsClient.zzc(r0)
            if (r0 == 0) goto L11
            com.google.android.gms.common.internal.BaseGmsClient r0 = r1.zzf
            com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener r0 = com.google.android.gms.common.internal.BaseGmsClient.zzc(r0)
            r0.onConnectionFailed(r2)
        L11:
            com.google.android.gms.common.internal.BaseGmsClient r0 = r1.zzf
            r0.onConnectionFailed(r2)
            return
    }

    @Override // com.google.android.gms.common.internal.zza
    protected final boolean zzd() {
            r6 = this;
            java.lang.String r0 = "GmsClient"
            r1 = 0
            android.os.IBinder r2 = r6.zze     // Catch: android.os.RemoteException -> L76
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch: android.os.RemoteException -> L76
            java.lang.String r2 = r2.getInterfaceDescriptor()     // Catch: android.os.RemoteException -> L76
            com.google.android.gms.common.internal.BaseGmsClient r3 = r6.zzf
            java.lang.String r3 = r3.getServiceDescriptor()
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L3b
            com.google.android.gms.common.internal.BaseGmsClient r3 = r6.zzf
            java.lang.String r3 = r3.getServiceDescriptor()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "service descriptor mismatch: "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = " vs. "
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            android.util.Log.w(r0, r2)
            return r1
        L3b:
            com.google.android.gms.common.internal.BaseGmsClient r0 = r6.zzf
            android.os.IBinder r2 = r6.zze
            android.os.IInterface r0 = r0.createServiceInterface(r2)
            if (r0 == 0) goto L75
            com.google.android.gms.common.internal.BaseGmsClient r2 = r6.zzf
            r3 = 2
            r4 = 4
            boolean r2 = com.google.android.gms.common.internal.BaseGmsClient.zzn(r2, r3, r4, r0)
            if (r2 != 0) goto L58
            com.google.android.gms.common.internal.BaseGmsClient r2 = r6.zzf
            r3 = 3
            boolean r0 = com.google.android.gms.common.internal.BaseGmsClient.zzn(r2, r3, r4, r0)
            if (r0 == 0) goto L75
        L58:
            com.google.android.gms.common.internal.BaseGmsClient r0 = r6.zzf
            r1 = 0
            com.google.android.gms.common.internal.BaseGmsClient.zzg(r0, r1)
            com.google.android.gms.common.internal.BaseGmsClient r0 = r6.zzf
            android.os.Bundle r1 = r0.getConnectionHint()
            com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks r0 = com.google.android.gms.common.internal.BaseGmsClient.zzb(r0)
            if (r0 == 0) goto L73
            com.google.android.gms.common.internal.BaseGmsClient r0 = r6.zzf
            com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks r0 = com.google.android.gms.common.internal.BaseGmsClient.zzb(r0)
            r0.onConnected(r1)
        L73:
            r0 = 1
            return r0
        L75:
            return r1
        L76:
            java.lang.String r2 = "service probably died"
            android.util.Log.w(r0, r2)
            return r1
    }
}
