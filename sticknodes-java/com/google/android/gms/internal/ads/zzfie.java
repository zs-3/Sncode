package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfie {
    public static com.google.android.gms.ads.internal.client.zze zza(java.lang.Throwable r7) {
            boolean r0 = r7 instanceof com.google.android.gms.internal.ads.zzego
            if (r0 == 0) goto L13
            com.google.android.gms.internal.ads.zzego r7 = (com.google.android.gms.internal.ads.zzego) r7
            int r0 = r7.zza()
            com.google.android.gms.ads.internal.client.zze r7 = r7.zzb()
            com.google.android.gms.ads.internal.client.zze r7 = zzc(r0, r7)
            return r7
        L13:
            boolean r0 = r7 instanceof com.google.android.gms.internal.ads.zzdye
            r1 = 0
            if (r0 == 0) goto L39
            java.lang.String r0 = r7.getMessage()
            if (r0 != 0) goto L29
            com.google.android.gms.internal.ads.zzdye r7 = (com.google.android.gms.internal.ads.zzdye) r7
            int r7 = r7.zza()
            com.google.android.gms.ads.internal.client.zze r7 = zzd(r7, r1, r1)
            goto L38
        L29:
            r0 = r7
            com.google.android.gms.internal.ads.zzdye r0 = (com.google.android.gms.internal.ads.zzdye) r0
            int r0 = r0.zza()
            java.lang.String r7 = r7.getMessage()
            com.google.android.gms.ads.internal.client.zze r7 = zzd(r0, r7, r1)
        L38:
            return r7
        L39:
            boolean r0 = r7 instanceof com.google.android.gms.ads.internal.util.zzba
            if (r0 == 0) goto L56
            com.google.android.gms.ads.internal.util.zzba r7 = (com.google.android.gms.ads.internal.util.zzba) r7
            com.google.android.gms.ads.internal.client.zze r6 = new com.google.android.gms.ads.internal.client.zze
            int r1 = r7.zza()
            java.lang.String r7 = r7.getMessage()
            java.lang.String r2 = com.google.android.gms.internal.ads.zzfyo.zzc(r7)
            r4 = 0
            r5 = 0
            java.lang.String r3 = "com.google.android.gms.ads"
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        L56:
            r7 = 1
            com.google.android.gms.ads.internal.client.zze r7 = zzd(r7, r1, r1)
            return r7
    }

    public static com.google.android.gms.ads.internal.client.zze zzb(java.lang.Throwable r2, com.google.android.gms.internal.ads.zzegp r3) {
            com.google.android.gms.ads.internal.client.zze r2 = zza(r2)
            int r0 = r2.zza
            r1 = 3
            if (r0 == r1) goto Lb
            if (r0 != 0) goto L1c
        Lb:
            com.google.android.gms.ads.internal.client.zze r0 = r2.zzd
            if (r0 == 0) goto L1c
            java.lang.String r0 = r0.zzc
            java.lang.String r1 = "com.google.android.gms.ads"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1c
            r0 = 0
            r2.zzd = r0
        L1c:
            if (r3 == 0) goto L24
            com.google.android.gms.internal.ads.zzcxt r3 = r3.zzb()
            r2.zze = r3
        L24:
            return r2
    }

    public static com.google.android.gms.ads.internal.client.zze zzc(int r3, com.google.android.gms.ads.internal.client.zze r4) {
            r0 = 0
            if (r3 == 0) goto L22
            r1 = 8
            if (r3 != r1) goto L1d
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzhS
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r2.zza(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 > 0) goto L1c
            r3 = 8
            goto L1d
        L1c:
            return r4
        L1d:
            com.google.android.gms.ads.internal.client.zze r3 = zzd(r3, r0, r4)
            return r3
        L22:
            throw r0
    }

    public static com.google.android.gms.ads.internal.client.zze zzd(int r9, java.lang.String r10, com.google.android.gms.ads.internal.client.zze r11) {
            int r0 = r9 + (-1)
            java.lang.String r1 = "No fill."
            r2 = 0
            if (r10 != 0) goto L54
            if (r9 == 0) goto L53
            switch(r0) {
                case 1: goto L50;
                case 2: goto L4e;
                case 3: goto L4b;
                case 4: goto L48;
                case 5: goto L45;
                case 6: goto L42;
                case 7: goto L3f;
                case 8: goto L3c;
                case 9: goto L39;
                case 10: goto L36;
                case 11: goto Lc;
                case 12: goto L21;
                case 13: goto L1e;
                case 14: goto L1b;
                case 15: goto L18;
                case 16: goto L15;
                case 17: goto L12;
                case 18: goto Lf;
                default: goto Lc;
            }
        Lc:
            java.lang.String r10 = "Internal error."
            goto L54
        Lf:
            java.lang.String r10 = "Ad inspector cannot be opened because it is already open."
            goto L54
        L12:
            java.lang.String r10 = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information."
            goto L54
        L15:
            java.lang.String r10 = "Ad inspector failed to load."
            goto L54
        L18:
            java.lang.String r10 = "Ad inspector had an internal error."
            goto L54
        L1b:
            java.lang.String r10 = "Invalid ad string."
            goto L54
        L1e:
            java.lang.String r10 = "Mismatch request IDs."
            goto L54
        L21:
            com.google.android.gms.internal.ads.zzbcm r10 = com.google.android.gms.internal.ads.zzbcv.zzhV
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r10 = r3.zza(r10)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            if (r10 > 0) goto L4e
            java.lang.String r10 = "The mediation adapter did not return an ad."
            goto L54
        L36:
            java.lang.String r10 = "The ad can not be shown when app is not in foreground."
            goto L54
        L39:
            java.lang.String r10 = "The ad has already been shown."
            goto L54
        L3c:
            java.lang.String r10 = "The ad is not ready."
            goto L54
        L3f:
            java.lang.String r10 = "A mediation adapter failed to show the ad."
            goto L54
        L42:
            java.lang.String r10 = "Invalid request: Invalid ad size."
            goto L54
        L45:
            java.lang.String r10 = "Invalid request: Invalid ad unit ID."
            goto L54
        L48:
            java.lang.String r10 = "Network error."
            goto L54
        L4b:
            java.lang.String r10 = "App ID missing."
            goto L54
        L4e:
            r5 = r1
            goto L55
        L50:
            java.lang.String r10 = "Invalid request."
            goto L54
        L53:
            throw r2
        L54:
            r5 = r10
        L55:
            com.google.android.gms.ads.internal.client.zze r10 = new com.google.android.gms.ads.internal.client.zze
            if (r9 == 0) goto Ldf
            r1 = 2
            r2 = 1
            r3 = 0
            r4 = 3
            switch(r0) {
                case 0: goto L96;
                case 1: goto L94;
                case 2: goto L97;
                case 3: goto L8f;
                case 4: goto L8d;
                case 5: goto L94;
                case 6: goto L94;
                case 7: goto L8a;
                case 8: goto L8d;
                case 9: goto L94;
                case 10: goto L97;
                case 11: goto L96;
                case 12: goto L73;
                case 13: goto L6e;
                case 14: goto L69;
                case 15: goto L96;
                case 16: goto L94;
                case 17: goto L8d;
                case 18: goto L97;
                default: goto L60;
            }
        L60:
            java.lang.AssertionError r10 = new java.lang.AssertionError
            switch(r9) {
                case 1: goto Ld3;
                case 2: goto Ld0;
                case 3: goto Lcd;
                case 4: goto Lca;
                case 5: goto Lc7;
                case 6: goto Lc4;
                case 7: goto Lc1;
                case 8: goto Lbe;
                case 9: goto Lbb;
                case 10: goto Lb8;
                case 11: goto Lb5;
                case 12: goto Lb2;
                case 13: goto Laf;
                case 14: goto Lac;
                case 15: goto La9;
                case 16: goto La6;
                case 17: goto La3;
                case 18: goto La0;
                default: goto L65;
            }
        L65:
            java.lang.String r9 = "AD_INSPECTOR_ALREADY_OPEN"
            goto Ld5
        L69:
            r9 = 11
            r4 = 11
            goto L97
        L6e:
            r9 = 10
            r4 = 10
            goto L97
        L73:
            com.google.android.gms.internal.ads.zzbcm r9 = com.google.android.gms.internal.ads.zzbcv.zzhV
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r9 = r0.zza(r9)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            if (r9 > 0) goto L97
            r9 = 9
            r4 = 9
            goto L97
        L8a:
            r9 = 4
            r4 = 4
            goto L97
        L8d:
            r4 = 2
            goto L97
        L8f:
            r9 = 8
            r4 = 8
            goto L97
        L94:
            r4 = 1
            goto L97
        L96:
            r4 = 0
        L97:
            r8 = 0
            java.lang.String r6 = "com.google.android.gms.ads"
            r3 = r10
            r7 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
        La0:
            java.lang.String r9 = "AD_INSPECTOR_NOT_IN_TEST_MODE"
            goto Ld5
        La3:
            java.lang.String r9 = "AD_INSPECTOR_FAILED_TO_LOAD"
            goto Ld5
        La6:
            java.lang.String r9 = "AD_INSPECTOR_INTERNAL_ERROR"
            goto Ld5
        La9:
            java.lang.String r9 = "INVALID_AD_STRING"
            goto Ld5
        Lac:
            java.lang.String r9 = "REQUEST_ID_MISMATCH"
            goto Ld5
        Laf:
            java.lang.String r9 = "MEDIATION_NO_FILL"
            goto Ld5
        Lb2:
            java.lang.String r9 = "INTERNAL_SHOW_ERROR"
            goto Ld5
        Lb5:
            java.lang.String r9 = "APP_NOT_FOREGROUND"
            goto Ld5
        Lb8:
            java.lang.String r9 = "AD_REUSED"
            goto Ld5
        Lbb:
            java.lang.String r9 = "NOT_READY"
            goto Ld5
        Lbe:
            java.lang.String r9 = "MEDIATION_SHOW_ERROR"
            goto Ld5
        Lc1:
            java.lang.String r9 = "INVALID_AD_SIZE"
            goto Ld5
        Lc4:
            java.lang.String r9 = "INVALID_AD_UNIT_ID"
            goto Ld5
        Lc7:
            java.lang.String r9 = "NETWORK_ERROR"
            goto Ld5
        Lca:
            java.lang.String r9 = "APP_ID_MISSING"
            goto Ld5
        Lcd:
            java.lang.String r9 = "NO_FILL"
            goto Ld5
        Ld0:
            java.lang.String r9 = "INVALID_REQUEST"
            goto Ld5
        Ld3:
            java.lang.String r9 = "INTERNAL_ERROR"
        Ld5:
            java.lang.String r11 = "Unknown SdkError: "
            java.lang.String r9 = r11.concat(r9)
            r10.<init>(r9)
            throw r10
        Ldf:
            throw r2
    }
}
