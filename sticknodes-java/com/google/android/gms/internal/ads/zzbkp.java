package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbkp implements com.google.android.gms.internal.ads.zzbjw {
    private final android.content.Context zza;

    public zzbkp(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void zza(java.lang.Object r3, java.util.Map r4) {
            r2 = this;
            java.lang.String r3 = "text"
            boolean r0 = r4.containsKey(r3)
            if (r0 == 0) goto L6d
            java.lang.Object r0 = r4.get(r3)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L15
            goto L6d
        L15:
            java.lang.Object r0 = r4.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Opening Share Sheet with text: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "android.intent.action.SEND"
            r0.setAction(r1)
            java.lang.String r1 = "text/plain"
            r0.setType(r1)
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r1 = "android.intent.extra.TEXT"
            r0.putExtra(r1, r3)
            java.lang.String r3 = "title"
            boolean r1 = r4.containsKey(r3)
            if (r1 == 0) goto L55
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "android.intent.extra.TITLE"
            r0.putExtra(r4, r3)
        L55:
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.lang.RuntimeException -> L5e
            android.content.Context r3 = r2.zza     // Catch: java.lang.RuntimeException -> L5e
            com.google.android.gms.ads.internal.util.zzt.zzT(r3, r0)     // Catch: java.lang.RuntimeException -> L5e
            return
        L5e:
            r3 = move-exception
            java.lang.String r4 = "Failed to open Share Sheet"
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r4, r3)
            com.google.android.gms.internal.ads.zzcad r4 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r0 = "ShareSheetGmsgHandler.onGmsg"
            r4.zzw(r3, r0)
        L6d:
            return
    }
}
