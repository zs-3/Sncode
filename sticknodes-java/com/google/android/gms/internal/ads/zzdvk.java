package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdvk extends com.google.android.gms.internal.ads.zzbkx {
    private final com.google.android.gms.internal.ads.zzdvn zza;
    private final com.google.android.gms.internal.ads.zzdvi zzb;
    private final java.util.Map zzc;

    zzdvk(com.google.android.gms.internal.ads.zzdvn r2, com.google.android.gms.internal.ads.zzdvi r3) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zzc = r0
            r1.zza = r2
            r1.zzb = r3
            return
    }

    private static com.google.android.gms.ads.internal.client.zzm zzc(java.util.Map r33) {
            com.google.android.gms.ads.internal.client.zzn r0 = new com.google.android.gms.ads.internal.client.zzn
            r0.<init>()
            java.lang.String r1 = "ad_request"
            r2 = r33
            java.lang.Object r1 = r2.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L16
            com.google.android.gms.ads.internal.client.zzm r0 = r0.zza()
            return r0
        L16:
            java.lang.String r1 = android.net.Uri.decode(r1)
            android.util.JsonReader r2 = new android.util.JsonReader
            java.io.StringReader r3 = new java.io.StringReader
            r3.<init>(r1)
            r2.<init>(r3)
            r2.beginObject()     // Catch: java.io.IOException -> L10e
        L27:
            boolean r1 = r2.hasNext()     // Catch: java.io.IOException -> L10e
            if (r1 == 0) goto L10a
            java.lang.String r1 = r2.nextName()     // Catch: java.io.IOException -> L10e
            int r3 = r1.hashCode()     // Catch: java.io.IOException -> L10e
            r4 = 1
            r5 = 0
            switch(r3) {
                case -1289032093: goto L77;
                case -839117230: goto L6d;
                case -733436947: goto L63;
                case -99890337: goto L59;
                case 523149226: goto L4f;
                case 597632527: goto L45;
                case 1411582723: goto L3b;
                default: goto L3a;
            }
        L3a:
            goto L81
        L3b:
            java.lang.String r3 = "tagForChildDirectedTreatment"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L81
            r1 = 3
            goto L82
        L45:
            java.lang.String r3 = "maxAdContentRating"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L81
            r1 = 5
            goto L82
        L4f:
            java.lang.String r3 = "keywords"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L81
            r1 = 1
            goto L82
        L59:
            java.lang.String r3 = "httpTimeoutMillis"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L81
            r1 = 6
            goto L82
        L63:
            java.lang.String r3 = "tagForUnderAgeOfConsent"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L81
            r1 = 4
            goto L82
        L6d:
            java.lang.String r3 = "isTestDevice"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L81
            r1 = 2
            goto L82
        L77:
            java.lang.String r3 = "extras"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L81
            r1 = 0
            goto L82
        L81:
            r1 = -1
        L82:
            switch(r1) {
                case 0: goto Le8;
                case 1: goto Lca;
                case 2: goto Lc1;
                case 3: goto Lb1;
                case 4: goto La1;
                case 5: goto L91;
                case 6: goto L89;
                default: goto L85;
            }
        L85:
            r2.skipValue()     // Catch: java.io.IOException -> L10e
            goto L27
        L89:
            int r1 = r2.nextInt()     // Catch: java.io.IOException -> L10e
            r0.zzc(r1)     // Catch: java.io.IOException -> L10e
            goto L27
        L91:
            java.lang.String r1 = r2.nextString()     // Catch: java.io.IOException -> L10e
            java.util.List r3 = com.google.android.gms.ads.RequestConfiguration.zza     // Catch: java.io.IOException -> L10e
            boolean r3 = r3.contains(r1)     // Catch: java.io.IOException -> L10e
            if (r3 == 0) goto L27
            r0.zzf(r1)     // Catch: java.io.IOException -> L10e
            goto L27
        La1:
            boolean r1 = r2.nextBoolean()     // Catch: java.io.IOException -> L10e
            if (r1 == 0) goto Lac
            r0.zzi(r4)     // Catch: java.io.IOException -> L10e
            goto L27
        Lac:
            r0.zzi(r5)     // Catch: java.io.IOException -> L10e
            goto L27
        Lb1:
            boolean r1 = r2.nextBoolean()     // Catch: java.io.IOException -> L10e
            if (r1 == 0) goto Lbc
            r0.zzh(r4)     // Catch: java.io.IOException -> L10e
            goto L27
        Lbc:
            r0.zzh(r5)     // Catch: java.io.IOException -> L10e
            goto L27
        Lc1:
            boolean r1 = r2.nextBoolean()     // Catch: java.io.IOException -> L10e
            r0.zzd(r1)     // Catch: java.io.IOException -> L10e
            goto L27
        Lca:
            r2.beginArray()     // Catch: java.io.IOException -> L10e
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.io.IOException -> L10e
            r1.<init>()     // Catch: java.io.IOException -> L10e
        Ld2:
            boolean r3 = r2.hasNext()     // Catch: java.io.IOException -> L10e
            if (r3 == 0) goto Le0
            java.lang.String r3 = r2.nextString()     // Catch: java.io.IOException -> L10e
            r1.add(r3)     // Catch: java.io.IOException -> L10e
            goto Ld2
        Le0:
            r2.endArray()     // Catch: java.io.IOException -> L10e
            r0.zze(r1)     // Catch: java.io.IOException -> L10e
            goto L27
        Le8:
            r2.beginObject()     // Catch: java.io.IOException -> L10e
            android.os.Bundle r1 = new android.os.Bundle     // Catch: java.io.IOException -> L10e
            r1.<init>()     // Catch: java.io.IOException -> L10e
        Lf0:
            boolean r3 = r2.hasNext()     // Catch: java.io.IOException -> L10e
            if (r3 == 0) goto L102
            java.lang.String r3 = r2.nextName()     // Catch: java.io.IOException -> L10e
            java.lang.String r4 = r2.nextString()     // Catch: java.io.IOException -> L10e
            r1.putString(r3, r4)     // Catch: java.io.IOException -> L10e
            goto Lf0
        L102:
            r2.endObject()     // Catch: java.io.IOException -> L10e
            r0.zzb(r1)     // Catch: java.io.IOException -> L10e
            goto L27
        L10a:
            r2.endObject()     // Catch: java.io.IOException -> L10e
            goto L113
        L10e:
            java.lang.String r1 = "Ad Request json was malformed, parsing ended early."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r1)
        L113:
            com.google.android.gms.ads.internal.client.zzm r0 = r0.zza()
            android.os.Bundle r1 = r0.zzm
            java.lang.String r2 = "com.google.ads.mediation.admob.AdMobAdapter"
            android.os.Bundle r1 = r1.getBundle(r2)
            if (r1 != 0) goto L128
            android.os.Bundle r1 = r0.zzc
            android.os.Bundle r3 = r0.zzm
            r3.putBundle(r2, r1)
        L128:
            r8 = r1
            int r5 = r0.zza
            long r6 = r0.zzb
            int r9 = r0.zzd
            java.util.List r10 = r0.zze
            boolean r11 = r0.zzf
            int r12 = r0.zzg
            boolean r13 = r0.zzh
            java.lang.String r14 = r0.zzi
            com.google.android.gms.ads.internal.client.zzfy r15 = r0.zzj
            android.location.Location r1 = r0.zzk
            r16 = r1
            java.lang.String r1 = r0.zzl
            r17 = r1
            android.os.Bundle r1 = r0.zzm
            r18 = r1
            android.os.Bundle r1 = r0.zzn
            r19 = r1
            java.util.List r1 = r0.zzo
            r20 = r1
            java.lang.String r1 = r0.zzp
            r21 = r1
            java.lang.String r1 = r0.zzq
            r22 = r1
            boolean r1 = r0.zzr
            r23 = r1
            com.google.android.gms.ads.internal.client.zzc r1 = r0.zzs
            r24 = r1
            int r1 = r0.zzt
            r25 = r1
            java.lang.String r1 = r0.zzu
            r26 = r1
            java.util.List r1 = r0.zzv
            r27 = r1
            int r1 = r0.zzw
            r28 = r1
            java.lang.String r1 = r0.zzx
            r29 = r1
            int r1 = r0.zzy
            r30 = r1
            long r0 = r0.zzz
            r31 = r0
            com.google.android.gms.ads.internal.client.zzm r0 = new com.google.android.gms.ads.internal.client.zzm
            r4 = r0
            r4.<init>(r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbky
    public final void zze() {
            r1 = this;
            java.util.Map r0 = r1.zzc
            r0.clear()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbky
    public final void zzf(java.lang.String r12) throws android.os.RemoteException {
            r11 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzjA
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L13
            return
        L13:
            java.lang.String r0 = java.lang.String.valueOf(r12)
            java.lang.String r1 = "Received H5 gmsg: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            android.net.Uri r12 = android.net.Uri.parse(r12)
            com.google.android.gms.ads.internal.zzu.zzp()
            java.util.Map r12 = com.google.android.gms.ads.internal.util.zzt.zzP(r12)
            java.lang.String r0 = "action"
            java.lang.Object r0 = r12.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L3f
            java.lang.String r12 = "H5 gmsg did not contain an action"
            com.google.android.gms.ads.internal.util.client.zzm.zze(r12)
            return
        L3f:
            int r1 = r0.hashCode()
            r2 = 579053441(0x2283a781, float:3.5684973E-18)
            r3 = 0
            r4 = -1
            r5 = 1
            if (r1 == r2) goto L5b
            r2 = 871091088(0x33ebcb90, float:1.0980068E-7)
            if (r1 == r2) goto L51
            goto L65
        L51:
            java.lang.String r1 = "initialize"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L65
            r1 = 0
            goto L66
        L5b:
            java.lang.String r1 = "dispose_all"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L65
            r1 = 1
            goto L66
        L65:
            r1 = -1
        L66:
            if (r1 == 0) goto L2bd
            if (r1 == r5) goto L29d
            java.lang.String r1 = "obj_id"
            java.lang.Object r1 = r12.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Objects.requireNonNull(r1)     // Catch: java.lang.Throwable -> L28f
            long r1 = java.lang.Long.parseLong(r1)     // Catch: java.lang.Throwable -> L28f
            int r6 = r0.hashCode()
            switch(r6) {
                case -1790951212: goto Lbc;
                case -1266374734: goto Lb2;
                case -257098725: goto La8;
                case 393881811: goto L9f;
                case 585513149: goto L95;
                case 1671767583: goto L8b;
                case 2109237041: goto L81;
                default: goto L80;
            }
        L80:
            goto Lc6
        L81:
            java.lang.String r3 = "create_rewarded_ad"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto Lc6
            r3 = 3
            goto Lc7
        L8b:
            java.lang.String r3 = "dispose"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto Lc6
            r3 = 6
            goto Lc7
        L95:
            java.lang.String r3 = "load_interstitial_ad"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto Lc6
            r3 = 1
            goto Lc7
        L9f:
            java.lang.String r5 = "create_interstitial_ad"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto Lc6
            goto Lc7
        La8:
            java.lang.String r3 = "load_rewarded_ad"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto Lc6
            r3 = 4
            goto Lc7
        Lb2:
            java.lang.String r3 = "show_rewarded_ad"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto Lc6
            r3 = 5
            goto Lc7
        Lbc:
            java.lang.String r3 = "show_interstitial_ad"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto Lc6
            r3 = 2
            goto Lc7
        Lc6:
            r3 = -1
        Lc7:
            java.lang.String r4 = "Could not create H5 ad, missing ad unit id"
            java.lang.String r5 = " with ad unit "
            java.lang.String r6 = "Could not create H5 ad, object ID already exists"
            java.lang.String r7 = "ad_unit"
            java.lang.String r8 = "Could not show H5 ad, object ID does not exist"
            java.lang.String r9 = "Could not load H5 ad, object ID does not exist"
            java.lang.String r10 = "Could not create H5 ad, too many existing objects"
            switch(r3) {
                case 0: goto L20b;
                case 1: goto L1ec;
                case 2: goto L1d1;
                case 3: goto L14d;
                case 4: goto L12e;
                case 5: goto L113;
                case 6: goto Le2;
                default: goto Ld8;
            }
        Ld8:
            java.lang.String r12 = "H5 gmsg contained invalid action: "
            java.lang.String r12 = r12.concat(r0)
            com.google.android.gms.ads.internal.util.client.zzm.zze(r12)
            return
        Le2:
            java.util.Map r12 = r11.zzc
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            java.lang.Object r12 = r12.get(r0)
            com.google.android.gms.internal.ads.zzdvd r12 = (com.google.android.gms.internal.ads.zzdvd) r12
            if (r12 != 0) goto Lf6
            java.lang.String r12 = "Could not dispose H5 ad, object ID does not exist"
            com.google.android.gms.ads.internal.util.client.zzm.zze(r12)
            return
        Lf6:
            r12.zza()
            java.util.Map r12 = r11.zzc
            r12.remove(r0)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Disposed H5 ad #"
            r12.append(r0)
            r12.append(r1)
            java.lang.String r12 = r12.toString()
            com.google.android.gms.ads.internal.util.zze.zza(r12)
            return
        L113:
            java.util.Map r12 = r11.zzc
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            java.lang.Object r12 = r12.get(r0)
            com.google.android.gms.internal.ads.zzdvd r12 = (com.google.android.gms.internal.ads.zzdvd) r12
            if (r12 != 0) goto L12a
            com.google.android.gms.ads.internal.util.client.zzm.zze(r8)
            com.google.android.gms.internal.ads.zzdvi r12 = r11.zzb
            r12.zzq(r1)
            return
        L12a:
            r12.zzc()
            return
        L12e:
            java.util.Map r0 = r11.zzc
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            java.lang.Object r0 = r0.get(r3)
            com.google.android.gms.internal.ads.zzdvd r0 = (com.google.android.gms.internal.ads.zzdvd) r0
            if (r0 != 0) goto L145
            com.google.android.gms.ads.internal.util.client.zzm.zze(r9)
            com.google.android.gms.internal.ads.zzdvi r12 = r11.zzb
            r12.zzq(r1)
            return
        L145:
            com.google.android.gms.ads.internal.client.zzm r12 = zzc(r12)
            r0.zzb(r12)
            return
        L14d:
            java.util.Map r0 = r11.zzc
            int r0 = r0.size()
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzjB
            com.google.android.gms.internal.ads.zzbct r8 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r8.zza(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r0 < r3) goto L16e
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r10)
            com.google.android.gms.internal.ads.zzdvi r12 = r11.zzb
            r12.zzi(r1)
            return
        L16e:
            java.util.Map r0 = r11.zzc
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L183
            com.google.android.gms.ads.internal.util.client.zzm.zze(r6)
            com.google.android.gms.internal.ads.zzdvi r12 = r11.zzb
            r12.zzi(r1)
            return
        L183:
            java.lang.Object r12 = r12.get(r7)
            java.lang.String r12 = (java.lang.String) r12
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto L198
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r4)
            com.google.android.gms.internal.ads.zzdvi r12 = r11.zzb
            r12.zzi(r1)
            return
        L198:
            com.google.android.gms.internal.ads.zzdvn r0 = r11.zza
            com.google.android.gms.internal.ads.zzdve r0 = r0.zzb()
            r0.zzb(r1)
            r0.zza(r12)
            com.google.android.gms.internal.ads.zzdvf r0 = r0.zzc()
            com.google.android.gms.internal.ads.zzdvt r0 = r0.zzb()
            java.util.Map r4 = r11.zzc
            r4.put(r3, r0)
            com.google.android.gms.internal.ads.zzdvi r0 = r11.zzb
            r0.zzh(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Created H5 rewarded #"
            r0.append(r3)
            r0.append(r1)
            r0.append(r5)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            com.google.android.gms.ads.internal.util.zze.zza(r12)
            return
        L1d1:
            java.util.Map r12 = r11.zzc
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            java.lang.Object r12 = r12.get(r0)
            com.google.android.gms.internal.ads.zzdvd r12 = (com.google.android.gms.internal.ads.zzdvd) r12
            if (r12 != 0) goto L1e8
            com.google.android.gms.ads.internal.util.client.zzm.zze(r8)
            com.google.android.gms.internal.ads.zzdvi r12 = r11.zzb
            r12.zzf(r1)
            return
        L1e8:
            r12.zzc()
            return
        L1ec:
            java.util.Map r0 = r11.zzc
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            java.lang.Object r0 = r0.get(r3)
            com.google.android.gms.internal.ads.zzdvd r0 = (com.google.android.gms.internal.ads.zzdvd) r0
            if (r0 != 0) goto L203
            com.google.android.gms.ads.internal.util.client.zzm.zze(r9)
            com.google.android.gms.internal.ads.zzdvi r12 = r11.zzb
            r12.zzf(r1)
            return
        L203:
            com.google.android.gms.ads.internal.client.zzm r12 = zzc(r12)
            r0.zzb(r12)
            return
        L20b:
            java.util.Map r0 = r11.zzc
            int r0 = r0.size()
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzjB
            com.google.android.gms.internal.ads.zzbct r8 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r8.zza(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r0 < r3) goto L22c
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r10)
            com.google.android.gms.internal.ads.zzdvi r12 = r11.zzb
            r12.zzi(r1)
            return
        L22c:
            java.util.Map r0 = r11.zzc
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L241
            com.google.android.gms.ads.internal.util.client.zzm.zze(r6)
            com.google.android.gms.internal.ads.zzdvi r12 = r11.zzb
            r12.zzi(r1)
            return
        L241:
            java.lang.Object r12 = r12.get(r7)
            java.lang.String r12 = (java.lang.String) r12
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto L256
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r4)
            com.google.android.gms.internal.ads.zzdvi r12 = r11.zzb
            r12.zzi(r1)
            return
        L256:
            com.google.android.gms.internal.ads.zzdvn r0 = r11.zza
            com.google.android.gms.internal.ads.zzdve r0 = r0.zzb()
            r0.zzb(r1)
            r0.zza(r12)
            com.google.android.gms.internal.ads.zzdvf r0 = r0.zzc()
            com.google.android.gms.internal.ads.zzdvp r0 = r0.zza()
            java.util.Map r4 = r11.zzc
            r4.put(r3, r0)
            com.google.android.gms.internal.ads.zzdvi r0 = r11.zzb
            r0.zzh(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Created H5 interstitial #"
            r0.append(r3)
            r0.append(r1)
            r0.append(r5)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            com.google.android.gms.ads.internal.util.zze.zza(r12)
            return
        L28f:
            java.lang.String r12 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "H5 gmsg did not contain a valid object id: "
            java.lang.String r12 = r0.concat(r12)
            com.google.android.gms.ads.internal.util.client.zzm.zze(r12)
            return
        L29d:
            java.util.Map r12 = r11.zzc
            java.util.Collection r12 = r12.values()
            java.util.Iterator r12 = r12.iterator()
        L2a7:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L2b7
            java.lang.Object r0 = r12.next()
            com.google.android.gms.internal.ads.zzdvd r0 = (com.google.android.gms.internal.ads.zzdvd) r0
            r0.zza()
            goto L2a7
        L2b7:
            java.util.Map r12 = r11.zzc
            r12.clear()
            return
        L2bd:
            java.util.Map r12 = r11.zzc
            r12.clear()
            com.google.android.gms.internal.ads.zzdvi r12 = r11.zzb
            r12.zza()
            return
    }
}
