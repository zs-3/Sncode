package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfgk {
    public final java.util.List zza;
    public final java.lang.String zzb;
    public final int zzc;
    public final int zzd;
    public final java.lang.String zze;
    public final int zzf;
    public final long zzg;
    public final boolean zzh;
    public final java.lang.String zzi;
    public final com.google.android.gms.internal.ads.zzfgj zzj;
    public final android.os.Bundle zzk;
    public final java.lang.String zzl;
    public final java.lang.String zzm;
    public final java.lang.String zzn;
    public final org.json.JSONObject zzo;
    public final org.json.JSONObject zzp;
    public final java.lang.String zzq;
    public final int zzr;
    public long zzs;
    public long zzt;

    zzfgk(android.util.JsonReader r30) throws java.lang.IllegalStateException, java.io.IOException, org.json.JSONException, java.lang.NumberFormatException {
            r29 = this;
            r0 = r29
            r29.<init>()
            java.util.List r1 = java.util.Collections.emptyList()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            r30.beginObject()
            r11 = 0
            java.lang.String r12 = ""
            r13 = 0
            r6 = r12
            r7 = r6
            r14 = r7
            r15 = r14
            r16 = r15
            r17 = r16
            r18 = r17
            r19 = r13
            r12 = 0
            r13 = 0
            r20 = -1
            r22 = -1
            r24 = 0
            r26 = -1
            r27 = 1
        L37:
            boolean r28 = r30.hasNext()
            if (r28 == 0) goto L264
            java.lang.String r9 = r30.nextName()
            java.lang.String r10 = "nofill_urls"
            boolean r10 = java.util.Objects.equals(r9, r10)
            if (r10 == 0) goto L50
            java.util.List r1 = com.google.android.gms.ads.internal.util.zzbs.zzd(r30)
        L4d:
            r10 = r30
            goto L37
        L50:
            java.lang.String r10 = "refresh_interval"
            boolean r10 = r10.equals(r9)
            if (r10 == 0) goto L60
            int r9 = r30.nextInt()
            r10 = r30
            r11 = r9
            goto L37
        L60:
            java.lang.String r10 = "refresh_load_delay_time_interval"
            boolean r10 = java.util.Objects.equals(r9, r10)
            if (r10 == 0) goto L6d
            int r26 = r30.nextInt()
            goto L4d
        L6d:
            java.lang.String r10 = "gws_query_id"
            boolean r10 = r10.equals(r9)
            if (r10 == 0) goto L7d
            java.lang.String r9 = r30.nextString()
            r10 = r30
            r14 = r9
            goto L37
        L7d:
            java.lang.String r10 = "analytics_query_ad_event_id"
            boolean r10 = r10.equals(r9)
            if (r10 == 0) goto L8d
            java.lang.String r9 = r30.nextString()
            r10 = r30
            r15 = r9
            goto L37
        L8d:
            java.lang.String r10 = "is_idless"
            boolean r10 = r10.equals(r9)
            if (r10 == 0) goto L9d
            boolean r9 = r30.nextBoolean()
            r10 = r30
            r13 = r9
            goto L37
        L9d:
            java.lang.String r10 = "response_code"
            boolean r10 = r10.equals(r9)
            if (r10 == 0) goto Lad
            int r9 = r30.nextInt()
            r10 = r30
            r12 = r9
            goto L37
        Lad:
            java.lang.String r10 = "latency"
            boolean r10 = r10.equals(r9)
            if (r10 == 0) goto Lba
            long r24 = r30.nextLong()
            goto L4d
        Lba:
            com.google.android.gms.internal.ads.zzbcm r10 = com.google.android.gms.internal.ads.zzbcv.zzhT
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r5.zza(r10)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto Le7
            java.lang.String r5 = "public_error"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto Le7
            android.util.JsonToken r5 = r30.peek()
            android.util.JsonToken r10 = android.util.JsonToken.BEGIN_OBJECT
            if (r5 != r10) goto Le7
            com.google.android.gms.internal.ads.zzfgj r5 = new com.google.android.gms.internal.ads.zzfgj
            r10 = r30
            r5.<init>(r10)
            r19 = r5
            goto L37
        Le7:
            r10 = r30
            java.lang.String r5 = "bidding_data"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto Lf8
            java.lang.String r5 = r30.nextString()
            r6 = r5
            goto L37
        Lf8:
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zzjZ
            com.google.android.gms.internal.ads.zzbct r8 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r8.zza(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L117
            java.lang.String r5 = "topics_should_record_observation"
            boolean r5 = java.util.Objects.equals(r9, r5)
            if (r5 == 0) goto L117
            r30.nextBoolean()
            goto L37
        L117:
            java.lang.String r5 = "adapter_response_replacement_key"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L127
            java.lang.String r5 = r30.nextString()
            r18 = r5
            goto L37
        L127:
            java.lang.String r5 = "response_info_extras"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L15b
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zzgB
            com.google.android.gms.internal.ads.zzbct r8 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r8.zza(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L156
            org.json.JSONObject r5 = com.google.android.gms.ads.internal.util.zzbs.zzi(r30)     // Catch: java.lang.IllegalStateException -> L14e java.lang.Throwable -> L153
            android.os.Bundle r5 = com.google.android.gms.ads.internal.util.zzbs.zza(r5)     // Catch: java.lang.IllegalStateException -> L14e java.lang.Throwable -> L153
            if (r5 == 0) goto L37
            r2 = r5
            goto L37
        L14e:
            r30.skipValue()
            goto L37
        L153:
            goto L37
        L156:
            r30.skipValue()
            goto L37
        L15b:
            java.lang.String r5 = "adRequestPostBody"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L182
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zziQ
            com.google.android.gms.internal.ads.zzbct r8 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r8.zza(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L17d
            java.lang.String r5 = r30.nextString()
            r16 = r5
            goto L37
        L17d:
            r30.skipValue()
            goto L37
        L182:
            java.lang.String r5 = "adRequestUrl"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L1a8
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zziQ
            com.google.android.gms.internal.ads.zzbct r8 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r8.zza(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L1a3
            java.lang.String r5 = r30.nextString()
            r7 = r5
            goto L37
        L1a3:
            r30.skipValue()
            goto L37
        L1a8:
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zziR
            com.google.android.gms.internal.ads.zzbct r8 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r8 = r8.zza(r5)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L1ca
            java.lang.String r8 = "adResponseBody"
            boolean r8 = java.util.Objects.equals(r9, r8)
            if (r8 == 0) goto L1ca
            java.lang.String r5 = r30.nextString()
            r17 = r5
            goto L37
        L1ca:
            com.google.android.gms.internal.ads.zzbct r8 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r8.zza(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L1e8
            java.lang.String r5 = "adResponseHeaders"
            boolean r5 = java.util.Objects.equals(r9, r5)
            if (r5 == 0) goto L1e8
            org.json.JSONObject r3 = com.google.android.gms.ads.internal.util.zzbs.zzi(r30)
            goto L37
        L1e8:
            java.lang.String r5 = "max_parallel_renderers"
            boolean r5 = java.util.Objects.equals(r9, r5)
            if (r5 == 0) goto L1fb
            int r5 = r30.nextInt()
            r8 = 1
            int r27 = java.lang.Math.max(r8, r5)
            goto L37
        L1fb:
            r8 = 1
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zziY
            com.google.android.gms.internal.ads.zzbct r8 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r8.zza(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L21c
            java.lang.String r5 = "inspector_ad_transaction_extras"
            boolean r5 = java.util.Objects.equals(r9, r5)
            if (r5 == 0) goto L21c
            org.json.JSONObject r4 = com.google.android.gms.ads.internal.util.zzbs.zzi(r30)
            goto L37
        L21c:
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zzcg
            com.google.android.gms.internal.ads.zzbct r8 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r8.zza(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L25f
            java.lang.String r5 = "latency_extras"
            boolean r5 = java.util.Objects.equals(r9, r5)
            if (r5 == 0) goto L25f
            org.json.JSONObject r5 = com.google.android.gms.ads.internal.util.zzbs.zzi(r30)     // Catch: java.lang.Throwable -> L153 java.lang.Throwable -> L153 java.lang.IllegalStateException -> L25a
            android.os.Bundle r5 = com.google.android.gms.ads.internal.util.zzbs.zza(r5)     // Catch: java.lang.Throwable -> L153 java.lang.Throwable -> L153 java.lang.IllegalStateException -> L25a
            if (r5 == 0) goto L37
            java.lang.String r8 = "start_time"
            double r8 = r5.getDouble(r8)     // Catch: java.lang.Throwable -> L153 java.lang.Throwable -> L153 java.lang.IllegalStateException -> L25a
            long r8 = zza(r8)     // Catch: java.lang.Throwable -> L153 java.lang.Throwable -> L153 java.lang.IllegalStateException -> L25a
            r22 = r8
            java.lang.String r8 = "end_time"
            double r8 = r5.getDouble(r8)     // Catch: java.lang.Throwable -> L153 java.lang.Throwable -> L153 java.lang.IllegalStateException -> L25a
            long r8 = zza(r8)     // Catch: java.lang.Throwable -> L153 java.lang.Throwable -> L153 java.lang.IllegalStateException -> L25a
            r20 = r8
            goto L37
        L25a:
            r30.skipValue()
            goto L37
        L25f:
            r30.skipValue()
            goto L37
        L264:
            r10 = r30
            r30.endObject()
            r0.zza = r1
            r0.zzc = r11
            com.google.android.gms.internal.ads.zzbeb r1 = com.google.android.gms.internal.ads.zzbex.zzd
            java.lang.Object r1 = r1.zze()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L27f
            r1 = -1
            r0.zzd = r1
            goto L2a2
        L27f:
            com.google.android.gms.internal.ads.zzbeb r1 = com.google.android.gms.internal.ads.zzbef.zza
            java.lang.Object r5 = r1.zze()
            java.lang.Long r5 = (java.lang.Long) r5
            long r8 = r5.longValue()
            r10 = -1
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 <= 0) goto L29e
            java.lang.Object r1 = r1.zze()
            java.lang.Long r1 = (java.lang.Long) r1
            int r1 = r1.intValue()
            r0.zzd = r1
            goto L2a2
        L29e:
            r5 = r26
            r0.zzd = r5
        L2a2:
            r0.zzb = r14
            r0.zze = r15
            r0.zzf = r12
            r8 = r24
            r0.zzg = r8
            r1 = r19
            r0.zzj = r1
            r0.zzh = r13
            r0.zzi = r6
            r0.zzk = r2
            r0.zzl = r7
            r12 = r16
            r0.zzm = r12
            r12 = r17
            r0.zzn = r12
            r0.zzo = r3
            r0.zzp = r4
            r12 = r18
            r0.zzq = r12
            com.google.android.gms.internal.ads.zzbeb r1 = com.google.android.gms.internal.ads.zzbev.zza
            java.lang.Object r2 = r1.zze()
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L2e4
            java.lang.Object r1 = r1.zze()
            java.lang.Long r1 = (java.lang.Long) r1
            int r27 = r1.intValue()
        L2e4:
            r1 = r27
            r0.zzr = r1
            r9 = r22
            r0.zzs = r9
            r9 = r20
            r0.zzt = r9
            return
    }

    private static final long zza(double r3) {
            r0 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto Lf
            r0 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto Ld
            goto Lf
        Ld:
            long r3 = (long) r3
            return r3
        Lf:
            r3 = -1
            return r3
    }
}
