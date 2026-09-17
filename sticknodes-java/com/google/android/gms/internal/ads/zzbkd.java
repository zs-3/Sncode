package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbkd implements com.google.android.gms.internal.ads.zzbjw {
    static final java.util.Map zza = null;
    private final com.google.android.gms.ads.internal.zzb zzb;
    private final com.google.android.gms.internal.ads.zzbsj zzc;
    private final com.google.android.gms.internal.ads.zzbsq zzd;

    static {
            java.lang.String r0 = "resize"
            java.lang.String r1 = "playVideo"
            java.lang.String r2 = "storePicture"
            java.lang.String r3 = "createCalendarEvent"
            java.lang.String r4 = "setOrientationProperties"
            java.lang.String r5 = "closeResizedAd"
            java.lang.String r6 = "unload"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6}
            r1 = 7
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r3 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r5 = 0
            r2[r5] = r4
            r4 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r2[r3] = r5
            r3 = 3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r2[r4] = r5
            r4 = 4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r2[r3] = r5
            r3 = 5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r2[r4] = r5
            r4 = 6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r2[r3] = r5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r4] = r1
            java.util.Map r0 = com.google.android.gms.common.util.CollectionUtils.mapOfKeyValueArrays(r0, r2)
            com.google.android.gms.internal.ads.zzbkd.zza = r0
            return
    }

    public zzbkd(com.google.android.gms.ads.internal.zzb r1, com.google.android.gms.internal.ads.zzbsj r2, com.google.android.gms.internal.ads.zzbsq r3) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            r0.zzd = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object r8, java.util.Map r9) {
            r7 = this;
            com.google.android.gms.internal.ads.zzcfo r8 = (com.google.android.gms.internal.ads.zzcfo) r8
            java.lang.String r0 = "a"
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.util.Map r1 = com.google.android.gms.internal.ads.zzbkd.zza
            java.lang.Object r0 = r1.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1 = 6
            r2 = 5
            r3 = 1
            r4 = 7
            if (r0 == r2) goto L63
            if (r0 == r4) goto L5d
            com.google.android.gms.ads.internal.zzb r5 = r7.zzb
            boolean r6 = r5.zzc()
            if (r6 == 0) goto L58
            if (r0 == r3) goto L52
            r5 = 3
            if (r0 == r5) goto L49
            r5 = 4
            if (r0 == r5) goto L40
            if (r0 == r2) goto L63
            if (r0 == r1) goto L3a
            if (r0 == r4) goto L5d
            java.lang.String r8 = "Unknown MRAID command called."
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r8)
            return
        L3a:
            com.google.android.gms.internal.ads.zzbsj r8 = r7.zzc
            r8.zza(r3)
            return
        L40:
            com.google.android.gms.internal.ads.zzbsg r0 = new com.google.android.gms.internal.ads.zzbsg
            r0.<init>(r8, r9)
            r0.zzc()
            return
        L49:
            com.google.android.gms.internal.ads.zzbsm r0 = new com.google.android.gms.internal.ads.zzbsm
            r0.<init>(r8, r9)
            r0.zzb()
            return
        L52:
            com.google.android.gms.internal.ads.zzbsj r8 = r7.zzc
            r8.zzb(r9)
            return
        L58:
            r8 = 0
            r5.zzb(r8)
            return
        L5d:
            com.google.android.gms.internal.ads.zzbsq r8 = r7.zzd
            r8.zzc()
            return
        L63:
            java.lang.String r0 = "forceOrientation"
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "allowOrientationChange"
            boolean r5 = r9.containsKey(r2)
            if (r5 == 0) goto L7d
            java.lang.Object r9 = r9.get(r2)
            java.lang.String r9 = (java.lang.String) r9
            boolean r3 = java.lang.Boolean.parseBoolean(r9)
        L7d:
            if (r8 != 0) goto L85
            java.lang.String r8 = "AdWebView is null"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r8)
            return
        L85:
            java.lang.String r9 = "portrait"
            boolean r9 = r9.equalsIgnoreCase(r0)
            if (r9 == 0) goto L8f
            r1 = 7
            goto L9e
        L8f:
            java.lang.String r9 = "landscape"
            boolean r9 = r9.equalsIgnoreCase(r0)
            if (r9 == 0) goto L98
            goto L9e
        L98:
            if (r3 == 0) goto L9c
            r1 = -1
            goto L9e
        L9c:
            r1 = 14
        L9e:
            r8.zzau(r1)
            return
    }
}
