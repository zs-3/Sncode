package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbsm extends com.google.android.gms.internal.ads.zzbsp {
    private final java.util.Map zza;
    private final android.content.Context zzb;

    public zzbsm(com.google.android.gms.internal.ads.zzcfo r2, java.util.Map r3) {
            r1 = this;
            java.lang.String r0 = "storePicture"
            r1.<init>(r2, r0)
            r1.zza = r3
            android.app.Activity r2 = r2.zzi()
            r1.zzb = r2
            return
    }

    static /* bridge */ /* synthetic */ android.content.Context zza(com.google.android.gms.internal.ads.zzbsm r0) {
            android.content.Context r0 = r0.zzb
            return r0
    }

    public final void zzb() {
            r6 = this;
            android.content.Context r0 = r6.zzb
            if (r0 != 0) goto La
            java.lang.String r0 = "Activity context is not available"
            r6.zzh(r0)
            return
        La:
            com.google.android.gms.ads.internal.zzu.zzp()
            android.content.Context r0 = r6.zzb
            com.google.android.gms.internal.ads.zzbcd r1 = new com.google.android.gms.internal.ads.zzbcd
            r1.<init>(r0)
            boolean r0 = r1.zzc()
            if (r0 != 0) goto L20
            java.lang.String r0 = "Feature is not supported by the device."
            r6.zzh(r0)
            return
        L20:
            java.util.Map r0 = r6.zza
            java.lang.String r1 = "iurl"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L36
            java.lang.String r0 = "Image url cannot be empty."
            r6.zzh(r0)
            return
        L36:
            boolean r1 = android.webkit.URLUtil.isValidUrl(r0)
            if (r1 == 0) goto Lbf
            android.net.Uri r1 = android.net.Uri.parse(r0)
            java.lang.String r1 = r1.getLastPathSegment()
            com.google.android.gms.ads.internal.zzu.zzp()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L4e
            goto Lb1
        L4e:
            java.lang.String r2 = "([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)"
            boolean r2 = r1.matches(r2)
            if (r2 == 0) goto Lb1
            com.google.android.gms.internal.ads.zzcad r2 = com.google.android.gms.ads.internal.zzu.zzo()
            android.content.res.Resources r2 = r2.zze()
            com.google.android.gms.ads.internal.zzu.zzp()
            android.content.Context r3 = r6.zzb
            android.app.AlertDialog$Builder r3 = com.google.android.gms.ads.internal.util.zzt.zzK(r3)
            if (r2 == 0) goto L70
            int r4 = com.google.android.gms.ads.impl.R.string.s1
            java.lang.String r4 = r2.getString(r4)
            goto L72
        L70:
            java.lang.String r4 = "Save image"
        L72:
            r3.setTitle(r4)
            if (r2 == 0) goto L7e
            int r4 = com.google.android.gms.ads.impl.R.string.s2
            java.lang.String r4 = r2.getString(r4)
            goto L80
        L7e:
            java.lang.String r4 = "Allow Ad to store image in Picture gallery?"
        L80:
            r3.setMessage(r4)
            if (r2 == 0) goto L8c
            int r4 = com.google.android.gms.ads.impl.R.string.s3
            java.lang.String r4 = r2.getString(r4)
            goto L8e
        L8c:
            java.lang.String r4 = "Accept"
        L8e:
            com.google.android.gms.internal.ads.zzbsk r5 = new com.google.android.gms.internal.ads.zzbsk
            r5.<init>(r6, r0, r1)
            r3.setPositiveButton(r4, r5)
            if (r2 == 0) goto L9f
            int r0 = com.google.android.gms.ads.impl.R.string.s4
            java.lang.String r0 = r2.getString(r0)
            goto La1
        L9f:
            java.lang.String r0 = "Decline"
        La1:
            com.google.android.gms.internal.ads.zzbsl r1 = new com.google.android.gms.internal.ads.zzbsl
            r1.<init>(r6)
            r3.setNegativeButton(r0, r1)
            android.app.AlertDialog r0 = r3.create()
            r0.show()
            return
        Lb1:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "Image type not recognized: "
            java.lang.String r0 = r1.concat(r0)
            r6.zzh(r0)
            return
        Lbf:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Invalid image url: "
            java.lang.String r0 = r1.concat(r0)
            r6.zzh(r0)
            return
    }
}
