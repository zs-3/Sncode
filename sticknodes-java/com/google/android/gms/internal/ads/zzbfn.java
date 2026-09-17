package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbfn extends android.widget.RelativeLayout {
    private static final float[] zza = null;
    private android.graphics.drawable.AnimationDrawable zzb;

    static {
            r0 = 8
            float[] r0 = new float[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584} // fill-array
            com.google.android.gms.internal.ads.zzbfn.zza = r0
            return
    }

    public zzbfn(android.content.Context r6, com.google.android.gms.internal.ads.zzbfm r7, android.widget.RelativeLayout.LayoutParams r8) {
            r5 = this;
            r5.<init>(r6)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
            android.graphics.drawable.ShapeDrawable r0 = new android.graphics.drawable.ShapeDrawable
            android.graphics.drawable.shapes.RoundRectShape r1 = new android.graphics.drawable.shapes.RoundRectShape
            float[] r2 = com.google.android.gms.internal.ads.zzbfn.zza
            r3 = 0
            r1.<init>(r2, r3, r3)
            r0.<init>(r1)
            android.graphics.Paint r1 = r0.getPaint()
            int r2 = r7.zzd()
            r1.setColor(r2)
            r5.setLayoutParams(r8)
            r5.setBackground(r0)
            android.widget.RelativeLayout$LayoutParams r8 = new android.widget.RelativeLayout$LayoutParams
            r0 = -2
            r8.<init>(r0, r0)
            java.lang.String r1 = r7.zzg()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L80
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            r1.<init>(r0, r0)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r6)
            r0.setLayoutParams(r1)
            r1 = 1195835393(0x47470001, float:50944.004)
            r0.setId(r1)
            android.graphics.Typeface r1 = android.graphics.Typeface.DEFAULT
            r0.setTypeface(r1)
            java.lang.String r1 = r7.zzg()
            r0.setText(r1)
            int r1 = r7.zze()
            r0.setTextColor(r1)
            int r1 = r7.zzf()
            float r1 = (float) r1
            r0.setTextSize(r1)
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            r1 = 4
            int r4 = com.google.android.gms.ads.internal.util.client.zzf.zzy(r6, r1)
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            int r1 = com.google.android.gms.ads.internal.util.client.zzf.zzy(r6, r1)
            r0.setPadding(r4, r2, r1, r2)
            r5.addView(r0)
            int r0 = r0.getId()
            r8.addRule(r3, r0)
        L80:
            android.widget.ImageView r0 = new android.widget.ImageView
            r0.<init>(r6)
            r0.setLayoutParams(r8)
            r6 = 1195835394(0x47470002, float:50944.008)
            r0.setId(r6)
            java.util.List r6 = r7.zzi()
            java.lang.String r8 = "Error while getting drawable."
            if (r6 == 0) goto Ld2
            int r1 = r6.size()
            if (r1 <= r3) goto Ld2
            android.graphics.drawable.AnimationDrawable r1 = new android.graphics.drawable.AnimationDrawable
            r1.<init>()
            r5.zzb = r1
            java.util.Iterator r6 = r6.iterator()
        La7:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto Lcc
            java.lang.Object r1 = r6.next()
            com.google.android.gms.internal.ads.zzbfp r1 = (com.google.android.gms.internal.ads.zzbfp) r1
            com.google.android.gms.dynamic.IObjectWrapper r1 = r1.zzf()     // Catch: java.lang.Exception -> Lc7
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r1)     // Catch: java.lang.Exception -> Lc7
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1     // Catch: java.lang.Exception -> Lc7
            android.graphics.drawable.AnimationDrawable r2 = r5.zzb     // Catch: java.lang.Exception -> Lc7
            int r3 = r7.zzb()     // Catch: java.lang.Exception -> Lc7
            r2.addFrame(r1, r3)     // Catch: java.lang.Exception -> Lc7
            goto La7
        Lc7:
            r1 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r8, r1)
            goto La7
        Lcc:
            android.graphics.drawable.AnimationDrawable r6 = r5.zzb
            r0.setBackground(r6)
            goto Lf0
        Ld2:
            int r7 = r6.size()
            if (r7 != r3) goto Lf0
            java.lang.Object r6 = r6.get(r2)     // Catch: java.lang.Exception -> Lec
            com.google.android.gms.internal.ads.zzbfp r6 = (com.google.android.gms.internal.ads.zzbfp) r6     // Catch: java.lang.Exception -> Lec
            com.google.android.gms.dynamic.IObjectWrapper r6 = r6.zzf()     // Catch: java.lang.Exception -> Lec
            java.lang.Object r6 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r6)     // Catch: java.lang.Exception -> Lec
            android.graphics.drawable.Drawable r6 = (android.graphics.drawable.Drawable) r6     // Catch: java.lang.Exception -> Lec
            r0.setImageDrawable(r6)     // Catch: java.lang.Exception -> Lec
            goto Lf0
        Lec:
            r6 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r8, r6)
        Lf0:
            r5.addView(r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r1 = this;
            android.graphics.drawable.AnimationDrawable r0 = r1.zzb
            if (r0 == 0) goto L7
            r0.start()
        L7:
            super.onAttachedToWindow()
            return
    }
}
