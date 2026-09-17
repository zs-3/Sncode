package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcdw implements com.google.android.gms.internal.ads.zzbjw {
    public zzcdw() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final java.lang.Integer zzb(java.util.Map r3, java.lang.String r4) {
            boolean r0 = r3.containsKey(r4)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.Object r0 = r3.get(r4)     // Catch: java.lang.NumberFormatException -> L17
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L17
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L17
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L17
            return r3
        L17:
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Precache invalid numeric parameter '"
            r0.append(r2)
            r0.append(r4)
            java.lang.String r4 = "': "
            r0.append(r4)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r3)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object r17, java.util.Map r18) {
            r16 = this;
            r0 = r18
            r1 = r17
            com.google.android.gms.internal.ads.zzccj r1 = (com.google.android.gms.internal.ads.zzccj) r1
            r2 = 3
            boolean r2 = com.google.android.gms.ads.internal.util.client.zzm.zzm(r2)
            if (r2 == 0) goto L24
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>(r0)
            java.lang.String r3 = "google.afma.Notify_dt"
            r2.remove(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "Precache GMSG: "
            java.lang.String r2 = r3.concat(r2)
            com.google.android.gms.ads.internal.util.client.zzm.zze(r2)
        L24:
            com.google.android.gms.internal.ads.zzcdo r2 = com.google.android.gms.ads.internal.zzu.zzy()
            java.lang.String r3 = "abort"
            boolean r3 = r0.containsKey(r3)
            if (r3 == 0) goto L3c
            boolean r0 = r2.zzd(r1)
            if (r0 != 0) goto L183
            java.lang.String r0 = "Precache abort but no precache task running."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
            return
        L3c:
            java.lang.String r3 = "src"
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "periodicReportIntervalMs"
            java.lang.Integer r4 = zzb(r0, r4)
            java.lang.String r5 = "exoPlayerRenderingIntervalMs"
            java.lang.Integer r5 = zzb(r0, r5)
            java.lang.String r6 = "exoPlayerIdleIntervalMs"
            java.lang.Integer r6 = zzb(r0, r6)
            com.google.android.gms.internal.ads.zzcci r7 = new com.google.android.gms.internal.ads.zzcci
            java.lang.String r8 = "flags"
            java.lang.Object r8 = r0.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            r7.<init>(r8)
            boolean r8 = r7.zzk
            if (r3 == 0) goto L13f
            r9 = 1
            java.lang.String[] r10 = new java.lang.String[r9]
            r11 = 0
            r10[r11] = r3
            java.lang.String r12 = "demuxed"
            java.lang.Object r12 = r0.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L9e
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch: org.json.JSONException -> L94
            r10.<init>(r12)     // Catch: org.json.JSONException -> L94
            int r14 = r10.length()     // Catch: org.json.JSONException -> L94
            java.lang.String[] r14 = new java.lang.String[r14]     // Catch: org.json.JSONException -> L94
            r15 = 0
        L83:
            int r13 = r10.length()     // Catch: org.json.JSONException -> L94
            if (r15 >= r13) goto L92
            java.lang.String r13 = r10.getString(r15)     // Catch: org.json.JSONException -> L94
            r14[r15] = r13     // Catch: org.json.JSONException -> L94
            int r15 = r15 + 1
            goto L83
        L92:
            r10 = r14
            goto L9e
        L94:
            java.lang.String r10 = "Malformed demuxed URL list for precache: "
            java.lang.String r10 = r10.concat(r12)
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r10)
            r10 = 0
        L9e:
            if (r10 != 0) goto La4
            java.lang.String[] r10 = new java.lang.String[r9]
            r10[r11] = r3
        La4:
            if (r8 == 0) goto Lc8
            java.util.Iterator r2 = r2.iterator()
        Laa:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto Lc6
            java.lang.Object r8 = r2.next()
            com.google.android.gms.internal.ads.zzcdn r8 = (com.google.android.gms.internal.ads.zzcdn) r8
            com.google.android.gms.internal.ads.zzccj r9 = r8.zza
            if (r9 != r1) goto Laa
            java.lang.String r9 = r8.zze()
            boolean r9 = r3.equals(r9)
            if (r9 == 0) goto Laa
            r13 = r8
            goto Lcc
        Lc6:
            r13 = 0
            goto Lcc
        Lc8:
            com.google.android.gms.internal.ads.zzcdn r13 = r2.zza(r1)
        Lcc:
            if (r13 == 0) goto Ld4
            java.lang.String r0 = "Precache task is already running."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
            return
        Ld4:
            com.google.android.gms.ads.internal.zza r2 = r1.zzj()
            if (r2 != 0) goto Le0
            java.lang.String r0 = "Precache requires a dependency provider."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
            return
        Le0:
            java.lang.String r2 = "player"
            java.lang.Integer r2 = zzb(r0, r2)
            if (r2 != 0) goto Lec
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
        Lec:
            if (r4 == 0) goto Lf5
            int r4 = r4.intValue()
            r1.zzA(r4)
        Lf5:
            if (r5 == 0) goto Lfe
            int r4 = r5.intValue()
            r1.zzy(r4)
        Lfe:
            if (r6 == 0) goto L107
            int r4 = r6.intValue()
            r1.zzx(r4)
        L107:
            int r2 = r2.intValue()
            com.google.android.gms.ads.internal.zza r4 = r1.zzj()
            com.google.android.gms.internal.ads.zzcdg r4 = r4.zzb
            if (r2 <= 0) goto L131
            int r2 = r7.zzg
            int r4 = com.google.android.gms.internal.ads.zzcca.zzu()
            if (r4 >= r2) goto L121
            com.google.android.gms.internal.ads.zzcee r2 = new com.google.android.gms.internal.ads.zzcee
            r2.<init>(r1, r7)
            goto L136
        L121:
            int r2 = r7.zzb
            if (r4 >= r2) goto L12b
            com.google.android.gms.internal.ads.zzceb r2 = new com.google.android.gms.internal.ads.zzceb
            r2.<init>(r1, r7)
            goto L136
        L12b:
            com.google.android.gms.internal.ads.zzcdz r2 = new com.google.android.gms.internal.ads.zzcdz
            r2.<init>(r1)
            goto L136
        L131:
            com.google.android.gms.internal.ads.zzcdy r2 = new com.google.android.gms.internal.ads.zzcdy
            r2.<init>(r1)
        L136:
            com.google.android.gms.internal.ads.zzcdn r4 = new com.google.android.gms.internal.ads.zzcdn
            r4.<init>(r1, r2, r3, r10)
            r4.zzb()
            goto L147
        L13f:
            com.google.android.gms.internal.ads.zzcdn r1 = r2.zza(r1)
            if (r1 == 0) goto L184
            com.google.android.gms.internal.ads.zzcdv r2 = r1.zzb
        L147:
            java.lang.String r1 = "minBufferMs"
            java.lang.Integer r1 = zzb(r0, r1)
            if (r1 == 0) goto L156
            int r1 = r1.intValue()
            r2.zzs(r1)
        L156:
            java.lang.String r1 = "maxBufferMs"
            java.lang.Integer r1 = zzb(r0, r1)
            if (r1 == 0) goto L165
            int r1 = r1.intValue()
            r2.zzr(r1)
        L165:
            java.lang.String r1 = "bufferForPlaybackMs"
            java.lang.Integer r1 = zzb(r0, r1)
            if (r1 == 0) goto L174
            int r1 = r1.intValue()
            r2.zzp(r1)
        L174:
            java.lang.String r1 = "bufferForPlaybackAfterRebufferMs"
            java.lang.Integer r0 = zzb(r0, r1)
            if (r0 == 0) goto L183
            int r0 = r0.intValue()
            r2.zzq(r0)
        L183:
            return
        L184:
            java.lang.String r0 = "Precache must specify a source."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
            return
    }
}
