package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzefz implements com.google.android.gms.internal.ads.zzega {
    public zzefz() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzegf zzc(java.lang.String r2, java.lang.String r3, java.lang.String r4, com.google.android.gms.internal.ads.zzegb r5, java.lang.String r6, android.webkit.WebView r7, java.lang.String r8, java.lang.String r9, com.google.android.gms.internal.ads.zzegc r10) {
            java.lang.String r2 = "Google"
            com.google.android.gms.internal.ads.zzfov r2 = com.google.android.gms.internal.ads.zzfov.zza(r2, r3)
            java.lang.String r3 = "javascript"
            com.google.android.gms.internal.ads.zzfou r3 = zzp(r3)
            java.lang.String r4 = r5.toString()
            com.google.android.gms.internal.ads.zzfon r4 = zzn(r4)
            com.google.android.gms.internal.ads.zzfou r9 = com.google.android.gms.internal.ads.zzfou.zzc
            r0 = 0
            if (r3 != r9) goto L1f
            java.lang.String r2 = "Omid html session error; Unable to parse impression owner: javascript"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r2)
            return r0
        L1f:
            if (r4 != 0) goto L2f
            java.lang.String r2 = java.lang.String.valueOf(r5)
            java.lang.String r3 = "Omid html session error; Unable to parse creative type: "
            java.lang.String r2 = r3.concat(r2)
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r2)
            return r0
        L2f:
            com.google.android.gms.internal.ads.zzfou r5 = zzp(r6)
            com.google.android.gms.internal.ads.zzfon r1 = com.google.android.gms.internal.ads.zzfon.zzd
            if (r4 != r1) goto L47
            if (r5 != r9) goto L47
            java.lang.String r2 = java.lang.String.valueOf(r6)
            java.lang.String r3 = "Omid html session error; Video events owner unknown for video creative: "
            java.lang.String r2 = r3.concat(r2)
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r2)
            return r0
        L47:
            java.lang.String r6 = ""
            com.google.android.gms.internal.ads.zzfok r2 = com.google.android.gms.internal.ads.zzfok.zzb(r2, r7, r8, r6)
            java.lang.String r6 = r10.toString()
            com.google.android.gms.internal.ads.zzfoq r6 = zzo(r6)
            r7 = 1
            com.google.android.gms.internal.ads.zzfoj r3 = com.google.android.gms.internal.ads.zzfoj.zza(r4, r6, r3, r5, r7)
            com.google.android.gms.internal.ads.zzfoi r3 = com.google.android.gms.internal.ads.zzfoi.zza(r3, r2)
            com.google.android.gms.internal.ads.zzegf r4 = new com.google.android.gms.internal.ads.zzegf
            r4.<init>(r3, r2)
            return r4
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzegf zzd(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, com.google.android.gms.internal.ads.zzegb r6, android.webkit.WebView r7, java.lang.String r8, java.lang.String r9, com.google.android.gms.internal.ads.zzegc r10) {
            com.google.android.gms.internal.ads.zzfov r2 = com.google.android.gms.internal.ads.zzfov.zza(r2, r3)
            java.lang.String r3 = "javascript"
            com.google.android.gms.internal.ads.zzfou r3 = zzp(r3)
            com.google.android.gms.internal.ads.zzfou r4 = zzp(r5)
            java.lang.String r9 = r6.toString()
            com.google.android.gms.internal.ads.zzfon r9 = zzn(r9)
            com.google.android.gms.internal.ads.zzfou r0 = com.google.android.gms.internal.ads.zzfou.zzc
            r1 = 0
            if (r3 != r0) goto L21
            java.lang.String r2 = "Omid js session error; Unable to parse impression owner: javascript"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r2)
            return r1
        L21:
            if (r9 != 0) goto L31
            java.lang.String r2 = java.lang.String.valueOf(r6)
            java.lang.String r3 = "Omid js session error; Unable to parse creative type: "
            java.lang.String r2 = r3.concat(r2)
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r2)
            return r1
        L31:
            com.google.android.gms.internal.ads.zzfon r6 = com.google.android.gms.internal.ads.zzfon.zzd
            if (r9 != r6) goto L45
            if (r4 != r0) goto L45
            java.lang.String r2 = java.lang.String.valueOf(r5)
            java.lang.String r3 = "Omid js session error; Video events owner unknown for video creative: "
            java.lang.String r2 = r3.concat(r2)
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r2)
            return r1
        L45:
            java.lang.String r5 = ""
            com.google.android.gms.internal.ads.zzfok r2 = com.google.android.gms.internal.ads.zzfok.zzc(r2, r7, r8, r5)
            java.lang.String r5 = r10.toString()
            com.google.android.gms.internal.ads.zzfoq r5 = zzo(r5)
            r6 = 1
            com.google.android.gms.internal.ads.zzfoj r3 = com.google.android.gms.internal.ads.zzfoj.zza(r9, r5, r3, r4, r6)
            com.google.android.gms.internal.ads.zzfoi r3 = com.google.android.gms.internal.ads.zzfoi.zza(r3, r2)
            com.google.android.gms.internal.ads.zzegf r4 = new com.google.android.gms.internal.ads.zzegf
            r4.<init>(r3, r2)
            return r4
    }

    private static com.google.android.gms.internal.ads.zzfon zzn(java.lang.String r4) {
            int r0 = r4.hashCode()
            r1 = -382745961(0xffffffffe92fc297, float:-1.3280059E25)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L2a
            r1 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r0 == r1) goto L20
            r1 = 714893483(0x2a9c68ab, float:2.7783795E-13)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "nativeDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 1
            goto L35
        L20:
            java.lang.String r0 = "video"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 2
            goto L35
        L2a:
            java.lang.String r0 = "htmlDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 0
            goto L35
        L34:
            r4 = -1
        L35:
            if (r4 == 0) goto L43
            if (r4 == r3) goto L40
            if (r4 == r2) goto L3d
            r4 = 0
            return r4
        L3d:
            com.google.android.gms.internal.ads.zzfon r4 = com.google.android.gms.internal.ads.zzfon.zzd
            return r4
        L40:
            com.google.android.gms.internal.ads.zzfon r4 = com.google.android.gms.internal.ads.zzfon.zzc
            return r4
        L43:
            com.google.android.gms.internal.ads.zzfon r4 = com.google.android.gms.internal.ads.zzfon.zzb
            return r4
    }

    private static com.google.android.gms.internal.ads.zzfoq zzo(java.lang.String r4) {
            int r0 = r4.hashCode()
            r1 = -1104128070(0xffffffffbe3057ba, float:-0.17220965)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L2a
            r1 = 1318088141(0x4e906dcd, float:1.2115575E9)
            if (r0 == r1) goto L20
            r1 = 1988248512(0x768243c0, float:1.3210405E33)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "onePixel"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 2
            goto L35
        L20:
            java.lang.String r0 = "definedByJavascript"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 1
            goto L35
        L2a:
            java.lang.String r0 = "beginToRender"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 0
            goto L35
        L34:
            r4 = -1
        L35:
            if (r4 == 0) goto L44
            if (r4 == r3) goto L41
            if (r4 == r2) goto L3e
            com.google.android.gms.internal.ads.zzfoq r4 = com.google.android.gms.internal.ads.zzfoq.zzb
            return r4
        L3e:
            com.google.android.gms.internal.ads.zzfoq r4 = com.google.android.gms.internal.ads.zzfoq.zze
            return r4
        L41:
            com.google.android.gms.internal.ads.zzfoq r4 = com.google.android.gms.internal.ads.zzfoq.zza
            return r4
        L44:
            com.google.android.gms.internal.ads.zzfoq r4 = com.google.android.gms.internal.ads.zzfoq.zzd
            return r4
    }

    private static com.google.android.gms.internal.ads.zzfou zzp(java.lang.String r1) {
            java.lang.String r0 = "native"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb
            com.google.android.gms.internal.ads.zzfou r1 = com.google.android.gms.internal.ads.zzfou.zza
            return r1
        Lb:
            java.lang.String r0 = "javascript"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L16
            com.google.android.gms.internal.ads.zzfou r1 = com.google.android.gms.internal.ads.zzfou.zzb
            return r1
        L16:
            com.google.android.gms.internal.ads.zzfou r1 = com.google.android.gms.internal.ads.zzfou.zzc
            return r1
    }

    private static final java.lang.Object zzq(com.google.android.gms.internal.ads.zzefy r2) {
            java.lang.Object r2 = r2.zza()     // Catch: java.lang.RuntimeException -> L5
            return r2
        L5:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r1 = "omid exception"
            r0.zzv(r2, r1)
            r2 = 0
            return r2
    }

    private static final void zzr(java.lang.Runnable r2) {
            r2.run()     // Catch: java.lang.RuntimeException -> L4
            return
        L4:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r1 = "omid exception"
            r0.zzv(r2, r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzega
    public final com.google.android.gms.internal.ads.zzegf zza(java.lang.String r12, android.webkit.WebView r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, com.google.android.gms.internal.ads.zzegc r17, com.google.android.gms.internal.ads.zzegb r18, java.lang.String r19) {
            r11 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzeU
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L36
            boolean r0 = com.google.android.gms.internal.ads.zzfog.zzb()
            if (r0 != 0) goto L19
            goto L36
        L19:
            com.google.android.gms.internal.ads.zzefo r0 = new com.google.android.gms.internal.ads.zzefo
            java.lang.String r2 = "Google"
            java.lang.String r4 = "javascript"
            java.lang.String r9 = ""
            r1 = r0
            r3 = r12
            r5 = r18
            r6 = r16
            r7 = r13
            r8 = r19
            r10 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r0 = zzq(r0)
            com.google.android.gms.internal.ads.zzegf r0 = (com.google.android.gms.internal.ads.zzegf) r0
            return r0
        L36:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzega
    public final com.google.android.gms.internal.ads.zzegf zzb(java.lang.String r12, android.webkit.WebView r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, com.google.android.gms.internal.ads.zzegc r18, com.google.android.gms.internal.ads.zzegb r19, java.lang.String r20) {
            r11 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzeU
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L36
            boolean r0 = com.google.android.gms.internal.ads.zzfog.zzb()
            if (r0 != 0) goto L19
            goto L36
        L19:
            com.google.android.gms.internal.ads.zzefr r0 = new com.google.android.gms.internal.ads.zzefr
            java.lang.String r4 = "javascript"
            java.lang.String r9 = ""
            r1 = r0
            r2 = r17
            r3 = r12
            r5 = r16
            r6 = r19
            r7 = r13
            r8 = r20
            r10 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r0 = zzq(r0)
            com.google.android.gms.internal.ads.zzegf r0 = (com.google.android.gms.internal.ads.zzegf) r0
            return r0
        L36:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzega
    public final com.google.android.gms.internal.ads.zzfot zze(com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2, android.webkit.WebView r3, boolean r4) {
            r1 = this;
            com.google.android.gms.internal.ads.zzefw r4 = new com.google.android.gms.internal.ads.zzefw
            r0 = 1
            r4.<init>(r2, r3, r0)
            java.lang.Object r2 = zzq(r4)
            com.google.android.gms.internal.ads.zzfot r2 = (com.google.android.gms.internal.ads.zzfot) r2
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzega
    public final java.lang.String zzf(android.content.Context r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzeU
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r0.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L14
            r2 = 0
            return r2
        L14:
            com.google.android.gms.internal.ads.zzefu r2 = new com.google.android.gms.internal.ads.zzefu
            r2.<init>()
            java.lang.Object r2 = zzq(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzega
    public final void zzg(com.google.android.gms.internal.ads.zzfoi r2, android.view.View r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzefn r0 = new com.google.android.gms.internal.ads.zzefn
            r0.<init>(r2, r3)
            zzr(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzega
    public final void zzh(com.google.android.gms.internal.ads.zzfot r2, android.view.View r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzeft r0 = new com.google.android.gms.internal.ads.zzeft
            r0.<init>(r2, r3)
            zzr(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzega
    public final void zzi(com.google.android.gms.internal.ads.zzfoi r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzefx r0 = new com.google.android.gms.internal.ads.zzefx
            r0.<init>(r2)
            zzr(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzega
    public final void zzj(com.google.android.gms.internal.ads.zzfoi r2, android.view.View r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzefp r0 = new com.google.android.gms.internal.ads.zzefp
            r0.<init>(r2, r3)
            zzr(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzega
    public final void zzk(com.google.android.gms.internal.ads.zzfoi r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzeU
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L24
            boolean r0 = com.google.android.gms.internal.ads.zzfog.zzb()
            if (r0 != 0) goto L19
            goto L24
        L19:
            java.util.Objects.requireNonNull(r3)
            com.google.android.gms.internal.ads.zzefq r0 = new com.google.android.gms.internal.ads.zzefq
            r0.<init>(r3)
            zzr(r0)
        L24:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzega
    public final boolean zzl(android.content.Context r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzeU
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 != 0) goto L19
            java.lang.String r3 = "Omid flag is disabled"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r3)
            return r1
        L19:
            com.google.android.gms.internal.ads.zzefs r0 = new com.google.android.gms.internal.ads.zzefs
            r0.<init>(r3)
            java.lang.Object r3 = zzq(r0)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            if (r3 == 0) goto L2e
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L2e
            r3 = 1
            return r3
        L2e:
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzega
    public final void zzm(com.google.android.gms.internal.ads.zzfot r2, com.google.android.gms.internal.ads.zzcgd r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzefv r0 = new com.google.android.gms.internal.ads.zzefv
            r0.<init>(r2, r3)
            zzr(r0)
            return
    }
}
