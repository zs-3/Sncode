package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzcdu implements java.lang.Runnable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ java.lang.String zzc;
    final /* synthetic */ java.lang.String zzd;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcdv zze;

    zzcdu(com.google.android.gms.internal.ads.zzcdv r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r5
            r0.zze = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "event"
            java.lang.String r2 = "precacheCanceled"
            r0.put(r1, r2)
            java.lang.String r1 = r3.zza
            java.lang.String r2 = "src"
            r0.put(r2, r1)
            java.lang.String r1 = r3.zzb
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L22
            java.lang.String r1 = r3.zzb
            java.lang.String r2 = "cachedSrc"
            r0.put(r2, r1)
        L22:
            java.lang.String r1 = r3.zzc
            int r2 = r1.hashCode()
            switch(r2) {
                case -1947652542: goto La1;
                case -1396664534: goto L96;
                case -1347010958: goto L8c;
                case -918817863: goto L81;
                case -659376217: goto L77;
                case -642208130: goto L6d;
                case -354048396: goto L62;
                case -32082395: goto L57;
                case 3387234: goto L4d;
                case 96784904: goto L43;
                case 580119100: goto L38;
                case 725497484: goto L2d;
                default: goto L2b;
            }
        L2b:
            goto Lab
        L2d:
            java.lang.String r2 = "noCacheDir"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lab
            r1 = 7
            goto Lac
        L38:
            java.lang.String r2 = "expireFailed"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lab
            r1 = 6
            goto Lac
        L43:
            java.lang.String r2 = "error"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lab
            r1 = 1
            goto Lac
        L4d:
            java.lang.String r2 = "noop"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lab
            r1 = 4
            goto Lac
        L57:
            java.lang.String r2 = "externalAbort"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lab
            r1 = 10
            goto Lac
        L62:
            java.lang.String r2 = "sizeExceeded"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lab
            r1 = 11
            goto Lac
        L6d:
            java.lang.String r2 = "playerFailed"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lab
            r1 = 5
            goto Lac
        L77:
            java.lang.String r2 = "contentLengthMissing"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lab
            r1 = 0
            goto Lac
        L81:
            java.lang.String r2 = "downloadTimeout"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lab
            r1 = 9
            goto Lac
        L8c:
            java.lang.String r2 = "inProgress"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lab
            r1 = 2
            goto Lac
        L96:
            java.lang.String r2 = "badUrl"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lab
            r1 = 8
            goto Lac
        La1:
            java.lang.String r2 = "interrupted"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lab
            r1 = 3
            goto Lac
        Lab:
            r1 = -1
        Lac:
            java.lang.String r2 = "internal"
            switch(r1) {
                case 0: goto Lba;
                case 1: goto Lba;
                case 2: goto Lba;
                case 3: goto Lba;
                case 4: goto Lba;
                case 5: goto Lba;
                case 6: goto Lb8;
                case 7: goto Lb8;
                case 8: goto Lb5;
                case 9: goto Lb5;
                case 10: goto Lb2;
                case 11: goto Lb2;
                default: goto Lb1;
            }
        Lb1:
            goto Lba
        Lb2:
            java.lang.String r2 = "policy"
            goto Lba
        Lb5:
            java.lang.String r2 = "network"
            goto Lba
        Lb8:
            java.lang.String r2 = "io"
        Lba:
            java.lang.String r1 = "type"
            r0.put(r1, r2)
            java.lang.String r1 = r3.zzc
            java.lang.String r2 = "reason"
            r0.put(r2, r1)
            java.lang.String r1 = r3.zzd
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto Ld5
            java.lang.String r1 = r3.zzd
            java.lang.String r2 = "message"
            r0.put(r2, r1)
        Ld5:
            com.google.android.gms.internal.ads.zzcdv r1 = r3.zze
            java.lang.String r2 = "onPrecacheEvent"
            com.google.android.gms.internal.ads.zzcdv.zze(r1, r2, r0)
            return
    }
}
