package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zzhm extends android.content.BroadcastReceiver {
    private final com.google.android.gms.measurement.internal.zzpv zza;
    private boolean zzb;
    private boolean zzc;

    static {
            java.lang.Class<com.google.android.gms.measurement.internal.zzhm> r0 = com.google.android.gms.measurement.internal.zzhm.class
            return
    }

    zzhm(com.google.android.gms.measurement.internal.zzpv r1) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            r0.zza = r1
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzpv zza(com.google.android.gms.measurement.internal.zzhm r0) {
            com.google.android.gms.measurement.internal.zzpv r0 = r0.zza
            return r0
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context r3, android.content.Intent r4) {
            r2 = this;
            com.google.android.gms.measurement.internal.zzpv r3 = r2.zza
            r3.zzM()
            java.lang.String r4 = r4.getAction()
            com.google.android.gms.measurement.internal.zzhe r0 = r3.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()
            java.lang.String r1 = "NetworkBroadcastReceiver received action"
            r0.zzb(r1, r4)
            java.lang.String r0 = "android.net.conn.CONNECTIVITY_CHANGE"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L39
            com.google.android.gms.measurement.internal.zzhk r4 = r3.zzp()
            boolean r4 = r4.zzd()
            boolean r0 = r2.zzc
            if (r0 == r4) goto L38
            r2.zzc = r4
            com.google.android.gms.measurement.internal.zzil r3 = r3.zzaX()
            com.google.android.gms.measurement.internal.zzhl r0 = new com.google.android.gms.measurement.internal.zzhl
            r0.<init>(r2, r4)
            r3.zzq(r0)
        L38:
            return
        L39:
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zzk()
            java.lang.String r0 = "NetworkBroadcastReceiver received unknown action"
            r3.zzb(r0, r4)
            return
    }

    public final void zzb() {
            r4 = this;
            com.google.android.gms.measurement.internal.zzpv r0 = r4.zza
            r0.zzM()
            com.google.android.gms.measurement.internal.zzil r1 = r0.zzaX()
            r1.zzg()
            boolean r1 = r4.zzb
            if (r1 == 0) goto L11
            return
        L11:
            android.content.Context r1 = r0.zzaT()
            android.content.IntentFilter r2 = new android.content.IntentFilter
            java.lang.String r3 = "android.net.conn.CONNECTIVITY_CHANGE"
            r2.<init>(r3)
            r1.registerReceiver(r4, r2)
            com.google.android.gms.measurement.internal.zzhk r1 = r0.zzp()
            boolean r1 = r1.zzd()
            r4.zzc = r1
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()
            boolean r1 = r4.zzc
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "Registering connectivity change receiver. Network connected"
            r0.zzb(r2, r1)
            r0 = 1
            r4.zzb = r0
            return
    }

    public final void zzc() {
            r3 = this;
            com.google.android.gms.measurement.internal.zzpv r0 = r3.zza
            r0.zzM()
            com.google.android.gms.measurement.internal.zzil r1 = r0.zzaX()
            r1.zzg()
            com.google.android.gms.measurement.internal.zzil r1 = r0.zzaX()
            r1.zzg()
            boolean r1 = r3.zzb
            if (r1 != 0) goto L18
            return
        L18:
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()
            java.lang.String r2 = "Unregistering connectivity change receiver"
            r1.zza(r2)
            r1 = 0
            r3.zzb = r1
            r3.zzc = r1
            android.content.Context r0 = r0.zzaT()
            r0.unregisterReceiver(r3)     // Catch: java.lang.IllegalArgumentException -> L32
            return
        L32:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzpv r1 = r3.zza
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()
            java.lang.String r2 = "Failed to unregister the network broadcast receiver"
            r1.zzb(r2, r0)
            return
    }
}
