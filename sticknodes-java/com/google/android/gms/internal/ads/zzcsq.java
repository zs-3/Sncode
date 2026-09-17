package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcsq extends android.widget.FrameLayout implements android.view.ViewTreeObserver.OnScrollChangedListener, android.view.ViewTreeObserver.OnGlobalLayoutListener {
    private final android.content.Context zza;
    private android.view.View zzb;

    private zzcsq(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r0.zza = r1
            return
    }

    public static com.google.android.gms.internal.ads.zzcsq zza(android.content.Context r4, android.view.View r5, com.google.android.gms.internal.ads.zzfgh r6) {
            com.google.android.gms.internal.ads.zzcsq r0 = new com.google.android.gms.internal.ads.zzcsq
            r0.<init>(r4)
            java.util.List r4 = r6.zzu
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto Le
            goto L3b
        Le:
            android.content.Context r4 = r0.zza
            android.content.res.Resources r4 = r4.getResources()
            if (r4 == 0) goto L3b
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            if (r4 == 0) goto L3b
            java.util.List r1 = r6.zzu
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            com.google.android.gms.internal.ads.zzfgi r1 = (com.google.android.gms.internal.ads.zzfgi) r1
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            int r3 = r1.zza
            float r3 = (float) r3
            float r4 = r4.density
            float r3 = r3 * r4
            int r1 = r1.zzb
            float r1 = (float) r1
            float r1 = r1 * r4
            int r4 = (int) r3
            int r1 = (int) r1
            r2.<init>(r4, r1)
            r0.setLayoutParams(r2)
        L3b:
            r0.zzb = r5
            r0.addView(r5)
            com.google.android.gms.ads.internal.zzu.zzx()
            com.google.android.gms.internal.ads.zzcba.zzb(r0, r0)
            com.google.android.gms.ads.internal.zzu.zzx()
            com.google.android.gms.internal.ads.zzcba.zza(r0, r0)
            org.json.JSONObject r4 = r6.zzah
            android.content.Context r5 = r0.zza
            android.widget.RelativeLayout r6 = new android.widget.RelativeLayout
            r6.<init>(r5)
            java.lang.String r5 = "header"
            org.json.JSONObject r5 = r4.optJSONObject(r5)
            if (r5 == 0) goto L62
            r1 = 10
            r0.zzc(r5, r6, r1)
        L62:
            java.lang.String r5 = "footer"
            org.json.JSONObject r4 = r4.optJSONObject(r5)
            if (r4 == 0) goto L6f
            r5 = 12
            r0.zzc(r4, r6, r5)
        L6f:
            r0.addView(r6)
            return r0
    }

    private final int zzb(double r2) {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            android.content.Context r0 = r1.zza
            int r2 = (int) r2
            int r2 = com.google.android.gms.ads.internal.util.client.zzf.zzy(r0, r2)
            return r2
    }

    private final void zzc(org.json.JSONObject r7, android.widget.RelativeLayout r8, int r9) {
            r6 = this;
            android.widget.TextView r0 = new android.widget.TextView
            android.content.Context r1 = r6.zza
            r0.<init>(r1)
            r1 = -1
            r0.setTextColor(r1)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.setBackgroundColor(r2)
            r2 = 17
            r0.setGravity(r2)
            java.lang.String r2 = "text"
            java.lang.String r3 = ""
            java.lang.String r2 = r7.optString(r2, r3)
            r0.setText(r2)
            java.lang.String r2 = "text_size"
            r3 = 4622382067542392832(0x4026000000000000, double:11.0)
            double r2 = r7.optDouble(r2, r3)
            float r2 = (float) r2
            r0.setTextSize(r2)
            java.lang.String r2 = "padding"
            r3 = 0
            double r2 = r7.optDouble(r2, r3)
            int r2 = r6.zzb(r2)
            r3 = 0
            r0.setPadding(r3, r2, r3, r2)
            android.widget.RelativeLayout$LayoutParams r2 = new android.widget.RelativeLayout$LayoutParams
            java.lang.String r3 = "height"
            r4 = 4624633867356078080(0x402e000000000000, double:15.0)
            double r3 = r7.optDouble(r3, r4)
            int r7 = r6.zzb(r3)
            r2.<init>(r1, r7)
            r2.addRule(r9)
            r8.addView(r0, r2)
            return
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
            r3 = this;
            r0 = 2
            int[] r0 = new int[r0]
            r3.getLocationInWindow(r0)
            android.view.View r1 = r3.zzb
            r2 = 1
            r0 = r0[r2]
            int r0 = -r0
            float r0 = (float) r0
            r1.setY(r0)
            return
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
            r3 = this;
            r0 = 2
            int[] r0 = new int[r0]
            r3.getLocationInWindow(r0)
            android.view.View r1 = r3.zzb
            r2 = 1
            r0 = r0[r2]
            int r0 = -r0
            float r0 = (float) r0
            r1.setY(r0)
            return
    }
}
