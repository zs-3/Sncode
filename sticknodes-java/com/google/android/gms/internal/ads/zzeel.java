package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeel {
    private final com.google.android.gms.internal.ads.zzbbu zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzedq zzc;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzd;

    public zzeel(android.content.Context r1, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2, com.google.android.gms.internal.ads.zzbbu r3, com.google.android.gms.internal.ads.zzedq r4) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzd = r2
            r0.zza = r3
            r0.zzc = r4
            return
    }

    final /* synthetic */ java.lang.Void zza(boolean r18, android.database.sqlite.SQLiteDatabase r19) throws java.lang.Exception {
            r17 = this;
            r1 = r17
            r10 = r19
            r11 = 0
            if (r18 == 0) goto L10
            android.content.Context r0 = r1.zzb
            java.lang.String r2 = "OfflineUpload.db"
            r0.deleteDatabase(r2)
            goto L118
        L10:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.lang.String r13 = "serialized_proto_data"
            java.lang.String[] r4 = new java.lang.String[]{r13}
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r3 = "offline_signal_contents"
            r2 = r19
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)
        L28:
            boolean r0 = r2.moveToNext()
            if (r0 == 0) goto L4c
            int r0 = r2.getColumnIndexOrThrow(r13)
            byte[] r0 = r2.getBlob(r0)
            com.google.android.gms.internal.ads.zzbcb$zzaf$zza r0 = com.google.android.gms.internal.ads.zzbcb.zzaf.zza.zzx(r0)     // Catch: com.google.android.gms.internal.ads.zzhbt -> L3e
            r12.add(r0)     // Catch: com.google.android.gms.internal.ads.zzhbt -> L3e
            goto L28
        L3e:
            r0 = move-exception
            java.lang.String r3 = "Unable to deserialize proto from offline signals database:"
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r3)
            java.lang.String r0 = r0.getMessage()
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r0)
            goto L28
        L4c:
            r2.close()
            android.content.Context r0 = r1.zzb
            com.google.android.gms.internal.ads.zzbcb$zzaf$zzc r2 = com.google.android.gms.internal.ads.zzbcb.zzaf.zzi()
            java.lang.String r0 = r0.getPackageName()
            r2.zzv(r0)
            java.lang.String r0 = android.os.Build.MODEL
            r2.zzy(r0)
            r0 = 0
            int r3 = com.google.android.gms.internal.ads.zzeef.zza(r10, r0)
            r2.zzA(r3)
            r2.zzh(r12)
            r3 = 1
            int r4 = com.google.android.gms.internal.ads.zzeef.zza(r10, r3)
            r2.zzE(r4)
            r4 = 3
            int r4 = com.google.android.gms.internal.ads.zzeef.zza(r10, r4)
            r2.zzx(r4)
            com.google.android.gms.common.util.Clock r4 = com.google.android.gms.ads.internal.zzu.zzB()
            long r4 = r4.currentTimeMillis()
            r2.zzF(r4)
            r4 = 2
            long r5 = com.google.android.gms.internal.ads.zzeef.zzb(r10, r4)
            r2.zzB(r5)
            com.google.android.gms.internal.ads.zzhbe r2 = r2.zzbn()
            com.google.android.gms.internal.ads.zzbcb$zzaf r2 = (com.google.android.gms.internal.ads.zzbcb.zzaf) r2
            int r5 = r12.size()
            r6 = 0
            r13 = r6
            r8 = 0
        L9d:
            if (r8 >= r5) goto Lbd
            java.lang.Object r9 = r12.get(r8)
            com.google.android.gms.internal.ads.zzbcb$zzaf$zza r9 = (com.google.android.gms.internal.ads.zzbcb.zzaf.zza) r9
            com.google.android.gms.internal.ads.zzbcb$zzq r15 = r9.zzk()
            com.google.android.gms.internal.ads.zzbcb$zzq r0 = com.google.android.gms.internal.ads.zzbcb.zzq.zzb
            if (r15 != r0) goto Lb9
            long r15 = r9.zze()
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 <= 0) goto Lb9
            long r13 = r9.zze()
        Lb9:
            int r8 = r8 + 1
            r0 = 0
            goto L9d
        Lbd:
            int r0 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r0 == 0) goto Ld6
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.Long r5 = java.lang.Long.valueOf(r13)
            java.lang.String r6 = "value"
            r0.put(r6, r5)
            java.lang.String r5 = "offline_signal_statistics"
            java.lang.String r6 = "statistic_name = 'last_successful_request_time'"
            r10.update(r5, r0, r6, r11)
        Ld6:
            com.google.android.gms.internal.ads.zzbbu r0 = r1.zza
            com.google.android.gms.internal.ads.zzeej r5 = new com.google.android.gms.internal.ads.zzeej
            r5.<init>(r2)
            r0.zzb(r5)
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r1.zzd
            com.google.android.gms.internal.ads.zzbcb$zzar$zza r2 = com.google.android.gms.internal.ads.zzbcb.zzar.zzd()
            int r0 = r0.buddyApkVersion
            r2.zzg(r0)
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r1.zzd
            int r0 = r0.clientJarVersion
            r2.zzi(r0)
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r1.zzd
            boolean r0 = r0.isClientJar
            if (r3 == r0) goto Lfa
            r0 = 2
            goto Lfb
        Lfa:
            r0 = 0
        Lfb:
            r2.zzh(r0)
            com.google.android.gms.internal.ads.zzhbe r0 = r2.zzbn()
            com.google.android.gms.internal.ads.zzbcb$zzar r0 = (com.google.android.gms.internal.ads.zzbcb.zzar) r0
            com.google.android.gms.internal.ads.zzbbu r2 = r1.zza
            com.google.android.gms.internal.ads.zzeek r3 = new com.google.android.gms.internal.ads.zzeek
            r3.<init>(r0)
            r2.zzb(r3)
            com.google.android.gms.internal.ads.zzbbu r0 = r1.zza
            r2 = 10004(0x2714, float:1.4019E-41)
            r0.zzc(r2)
            com.google.android.gms.internal.ads.zzeef.zze(r19)
        L118:
            return r11
    }

    public final void zzb(boolean r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzedq r0 = r2.zzc     // Catch: java.lang.Exception -> Lb
            com.google.android.gms.internal.ads.zzeei r1 = new com.google.android.gms.internal.ads.zzeei     // Catch: java.lang.Exception -> Lb
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> Lb
            r0.zza(r1)     // Catch: java.lang.Exception -> Lb
            return
        Lb:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "Error in offline signals database startup: "
            java.lang.String r3 = r0.concat(r3)
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r3)
            return
    }
}
