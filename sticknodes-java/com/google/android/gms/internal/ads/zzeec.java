package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeec extends com.google.android.gms.internal.ads.zzeed {
    private static final android.util.SparseArray zzb = null;
    private final android.content.Context zzc;
    private final com.google.android.gms.internal.ads.zzcxe zzd;
    private final android.telephony.TelephonyManager zze;
    private final com.google.android.gms.internal.ads.zzedu zzf;
    private com.google.android.gms.internal.ads.zzbcb.zzq zzg;

    static {
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            com.google.android.gms.internal.ads.zzeec.zzb = r0
            android.net.NetworkInfo$DetailedState r1 = android.net.NetworkInfo.DetailedState.CONNECTED
            int r1 = r1.ordinal()
            com.google.android.gms.internal.ads.zzbcb$zzaf$zzd r2 = com.google.android.gms.internal.ads.zzbcb.zzaf.zzd.zzc
            r0.put(r1, r2)
            android.net.NetworkInfo$DetailedState r1 = android.net.NetworkInfo.DetailedState.AUTHENTICATING
            int r1 = r1.ordinal()
            com.google.android.gms.internal.ads.zzbcb$zzaf$zzd r2 = com.google.android.gms.internal.ads.zzbcb.zzaf.zzd.zzb
            r0.put(r1, r2)
            android.net.NetworkInfo$DetailedState r1 = android.net.NetworkInfo.DetailedState.CONNECTING
            int r1 = r1.ordinal()
            r0.put(r1, r2)
            android.net.NetworkInfo$DetailedState r1 = android.net.NetworkInfo.DetailedState.OBTAINING_IPADDR
            int r1 = r1.ordinal()
            r0.put(r1, r2)
            android.net.NetworkInfo$DetailedState r1 = android.net.NetworkInfo.DetailedState.DISCONNECTING
            int r1 = r1.ordinal()
            com.google.android.gms.internal.ads.zzbcb$zzaf$zzd r3 = com.google.android.gms.internal.ads.zzbcb.zzaf.zzd.zzd
            r0.put(r1, r3)
            android.net.NetworkInfo$DetailedState r1 = android.net.NetworkInfo.DetailedState.BLOCKED
            int r1 = r1.ordinal()
            com.google.android.gms.internal.ads.zzbcb$zzaf$zzd r3 = com.google.android.gms.internal.ads.zzbcb.zzaf.zzd.zze
            r0.put(r1, r3)
            android.net.NetworkInfo$DetailedState r1 = android.net.NetworkInfo.DetailedState.DISCONNECTED
            int r1 = r1.ordinal()
            r0.put(r1, r3)
            android.net.NetworkInfo$DetailedState r1 = android.net.NetworkInfo.DetailedState.FAILED
            int r1 = r1.ordinal()
            r0.put(r1, r3)
            android.net.NetworkInfo$DetailedState r1 = android.net.NetworkInfo.DetailedState.IDLE
            int r1 = r1.ordinal()
            r0.put(r1, r3)
            android.net.NetworkInfo$DetailedState r1 = android.net.NetworkInfo.DetailedState.SCANNING
            int r1 = r1.ordinal()
            r0.put(r1, r3)
            android.net.NetworkInfo$DetailedState r1 = android.net.NetworkInfo.DetailedState.SUSPENDED
            int r1 = r1.ordinal()
            com.google.android.gms.internal.ads.zzbcb$zzaf$zzd r3 = com.google.android.gms.internal.ads.zzbcb.zzaf.zzd.zzf
            r0.put(r1, r3)
            android.net.NetworkInfo$DetailedState r1 = android.net.NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK
            int r1 = r1.ordinal()
            r0.put(r1, r2)
            android.net.NetworkInfo$DetailedState r1 = android.net.NetworkInfo.DetailedState.VERIFYING_POOR_LINK
            int r1 = r1.ordinal()
            r0.put(r1, r2)
            return
    }

    zzeec(android.content.Context r1, com.google.android.gms.internal.ads.zzcxe r2, com.google.android.gms.internal.ads.zzedu r3, com.google.android.gms.internal.ads.zzedq r4, com.google.android.gms.ads.internal.util.zzg r5) {
            r0 = this;
            r0.<init>(r4, r5)
            r0.zzc = r1
            r0.zzd = r2
            r0.zzf = r3
            java.lang.String r2 = "phone"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1
            r0.zze = r1
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzbcb.zzab zza(com.google.android.gms.internal.ads.zzeec r4, android.os.Bundle r5) {
            com.google.android.gms.internal.ads.zzbcb$zzab$zza r0 = com.google.android.gms.internal.ads.zzbcb.zzab.zza()
            java.lang.String r1 = "cnt"
            r2 = -2
            int r1 = r5.getInt(r1, r2)
            java.lang.String r2 = "gnt"
            r3 = 0
            int r5 = r5.getInt(r2, r3)
            r2 = -1
            if (r1 != r2) goto L1a
            com.google.android.gms.internal.ads.zzbcb$zzq r5 = com.google.android.gms.internal.ads.zzbcb.zzq.zzb
            r4.zzg = r5
            goto L45
        L1a:
            com.google.android.gms.internal.ads.zzbcb$zzq r2 = com.google.android.gms.internal.ads.zzbcb.zzq.zza
            r4.zzg = r2
            if (r1 == 0) goto L2f
            r4 = 1
            if (r1 == r4) goto L29
            com.google.android.gms.internal.ads.zzbcb$zzab$zzc r4 = com.google.android.gms.internal.ads.zzbcb.zzab.zzc.zza
            r0.zzd(r4)
            goto L34
        L29:
            com.google.android.gms.internal.ads.zzbcb$zzab$zzc r4 = com.google.android.gms.internal.ads.zzbcb.zzab.zzc.zzc
            r0.zzd(r4)
            goto L34
        L2f:
            com.google.android.gms.internal.ads.zzbcb$zzab$zzc r4 = com.google.android.gms.internal.ads.zzbcb.zzab.zzc.zzb
            r0.zzd(r4)
        L34:
            switch(r5) {
                case 1: goto L40;
                case 2: goto L40;
                case 3: goto L3d;
                case 4: goto L40;
                case 5: goto L3d;
                case 6: goto L3d;
                case 7: goto L40;
                case 8: goto L3d;
                case 9: goto L3d;
                case 10: goto L3d;
                case 11: goto L40;
                case 12: goto L3d;
                case 13: goto L3a;
                case 14: goto L3d;
                case 15: goto L3d;
                case 16: goto L40;
                case 17: goto L3d;
                default: goto L37;
            }
        L37:
            com.google.android.gms.internal.ads.zzbcb$zzab$zzb r4 = com.google.android.gms.internal.ads.zzbcb.zzab.zzb.zza
            goto L42
        L3a:
            com.google.android.gms.internal.ads.zzbcb$zzab$zzb r4 = com.google.android.gms.internal.ads.zzbcb.zzab.zzb.zzd
            goto L42
        L3d:
            com.google.android.gms.internal.ads.zzbcb$zzab$zzb r4 = com.google.android.gms.internal.ads.zzbcb.zzab.zzb.zzc
            goto L42
        L40:
            com.google.android.gms.internal.ads.zzbcb$zzab$zzb r4 = com.google.android.gms.internal.ads.zzbcb.zzab.zzb.zzb
        L42:
            r0.zzc(r4)
        L45:
            com.google.android.gms.internal.ads.zzhbe r4 = r0.zzbn()
            com.google.android.gms.internal.ads.zzbcb$zzab r4 = (com.google.android.gms.internal.ads.zzbcb.zzab) r4
            return r4
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzbcb.zzaf.zzd zzb(com.google.android.gms.internal.ads.zzeec r1, android.os.Bundle r2) {
            java.lang.String r1 = "device"
            android.os.Bundle r1 = com.google.android.gms.internal.ads.zzfhq.zza(r2, r1)
            java.lang.String r2 = "network"
            android.os.Bundle r1 = com.google.android.gms.internal.ads.zzfhq.zza(r1, r2)
            java.lang.String r2 = "active_network_state"
            r0 = -1
            int r1 = r1.getInt(r2, r0)
            android.util.SparseArray r2 = com.google.android.gms.internal.ads.zzeec.zzb
            com.google.android.gms.internal.ads.zzbcb$zzaf$zzd r0 = com.google.android.gms.internal.ads.zzbcb.zzaf.zzd.zza
            java.lang.Object r1 = r2.get(r1, r0)
            com.google.android.gms.internal.ads.zzbcb$zzaf$zzd r1 = (com.google.android.gms.internal.ads.zzbcb.zzaf.zzd) r1
            return r1
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzedu zzc(com.google.android.gms.internal.ads.zzeec r0) {
            com.google.android.gms.internal.ads.zzedu r0 = r0.zzf
            return r0
    }

    static /* bridge */ /* synthetic */ byte[] zze(com.google.android.gms.internal.ads.zzeec r5, boolean r6, java.util.ArrayList r7, com.google.android.gms.internal.ads.zzbcb.zzab r8, com.google.android.gms.internal.ads.zzbcb.zzaf.zzd r9) {
            com.google.android.gms.internal.ads.zzbcb$zzaf$zza$zza r0 = com.google.android.gms.internal.ads.zzbcb.zzaf.zza.zzn()
            r0.zzn(r7)
            android.content.Context r7 = r5.zzc
            android.content.ContentResolver r7 = r7.getContentResolver()
            java.lang.String r1 = "airplane_mode_on"
            r2 = 0
            int r7 = android.provider.Settings.Global.getInt(r7, r1, r2)
            r1 = 1
            if (r7 == 0) goto L19
            r7 = 1
            goto L1a
        L19:
            r7 = 0
        L1a:
            com.google.android.gms.internal.ads.zzbcb$zzq r7 = zzg(r7)
            r0.zzD(r7)
            com.google.android.gms.ads.internal.util.zzab r7 = com.google.android.gms.ads.internal.zzu.zzq()
            android.content.Context r3 = r5.zzc
            android.telephony.TelephonyManager r4 = r5.zze
            com.google.android.gms.internal.ads.zzbcb$zzq r7 = r7.zzg(r3, r4)
            r0.zzE(r7)
            com.google.android.gms.internal.ads.zzedu r7 = r5.zzf
            long r3 = r7.zze()
            r0.zzM(r3)
            com.google.android.gms.internal.ads.zzedu r7 = r5.zzf
            long r3 = r7.zzb()
            r0.zzL(r3)
            com.google.android.gms.internal.ads.zzedu r7 = r5.zzf
            int r7 = r7.zza()
            r0.zzG(r7)
            r0.zzH(r9)
            r0.zzJ(r8)
            com.google.android.gms.internal.ads.zzbcb$zzq r7 = r5.zzg
            r0.zzK(r7)
            com.google.android.gms.internal.ads.zzbcb$zzq r6 = zzg(r6)
            r0.zzN(r6)
            com.google.android.gms.internal.ads.zzedu r6 = r5.zzf
            long r6 = r6.zzd()
            r0.zzP(r6)
            com.google.android.gms.common.util.Clock r6 = com.google.android.gms.ads.internal.zzu.zzB()
            long r6 = r6.currentTimeMillis()
            r0.zzO(r6)
            android.content.Context r5 = r5.zzc
            android.content.ContentResolver r5 = r5.getContentResolver()
            java.lang.String r6 = "wifi_on"
            int r5 = android.provider.Settings.Global.getInt(r5, r6, r2)
            if (r5 == 0) goto L80
            r2 = 1
        L80:
            com.google.android.gms.internal.ads.zzbcb$zzq r5 = zzg(r2)
            r0.zzQ(r5)
            com.google.android.gms.internal.ads.zzhbe r5 = r0.zzbn()
            com.google.android.gms.internal.ads.zzbcb$zzaf$zza r5 = (com.google.android.gms.internal.ads.zzbcb.zzaf.zza) r5
            byte[] r5 = r5.zzaV()
            return r5
    }

    private static final com.google.android.gms.internal.ads.zzbcb.zzq zzg(boolean r0) {
            if (r0 == 0) goto L5
            com.google.android.gms.internal.ads.zzbcb$zzq r0 = com.google.android.gms.internal.ads.zzbcb.zzq.zzb
            goto L7
        L5:
            com.google.android.gms.internal.ads.zzbcb$zzq r0 = com.google.android.gms.internal.ads.zzbcb.zzq.zza
        L7:
            return r0
    }

    public final void zzd(boolean r3) {
            r2 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.google.android.gms.internal.ads.zzcxe r1 = r2.zzd
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zzb(r0)
            com.google.android.gms.internal.ads.zzeeb r1 = new com.google.android.gms.internal.ads.zzeeb
            r1.<init>(r2, r3)
            com.google.android.gms.internal.ads.zzgfz r3 = com.google.android.gms.internal.ads.zzcan.zzf
            com.google.android.gms.internal.ads.zzgfo.zzr(r0, r1, r3)
            return
    }
}
