package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcdk implements com.google.android.gms.internal.ads.zzbjw {
    public zzcdk() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object r8, java.util.Map r9) {
            r7 = this;
            com.google.android.gms.internal.ads.zzccj r8 = (com.google.android.gms.internal.ads.zzccj) r8
            com.google.android.gms.internal.ads.zzcgq r0 = r8.zzq()
            java.lang.String r1 = "duration"
            java.lang.String r2 = "1"
            if (r0 != 0) goto L3a
            java.lang.Object r0 = r9.get(r1)     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
            java.lang.String r3 = "customControlsAllowed"
            java.lang.Object r3 = r9.get(r3)     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
            boolean r3 = r2.equals(r3)     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
            java.lang.String r4 = "clickToExpandAllowed"
            java.lang.Object r4 = r9.get(r4)     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
            boolean r4 = r2.equals(r4)     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
            com.google.android.gms.internal.ads.zzcgq r5 = new com.google.android.gms.internal.ads.zzcgq     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
            r5.<init>(r8, r0, r3, r4)     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
            r8.zzC(r5)     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
            r0 = r5
            goto L3a
        L34:
            r8 = move-exception
            goto Lc5
        L37:
            r8 = move-exception
            goto Lc5
        L3a:
            java.lang.Object r8 = r9.get(r1)     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
            float r8 = java.lang.Float.parseFloat(r8)     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
            java.lang.String r1 = "muted"
            java.lang.Object r1 = r9.get(r1)     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
            boolean r4 = r2.equals(r1)     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
            java.lang.String r1 = "currentTime"
            java.lang.Object r1 = r9.get(r1)     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
            float r1 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
            java.lang.String r2 = "playbackState"
            java.lang.Object r2 = r9.get(r2)     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
            r3 = 3
            r5 = 0
            if (r2 < 0) goto L6e
            if (r2 <= r3) goto L6d
            goto L6e
        L6d:
            r5 = r2
        L6e:
            java.lang.String r2 = "aspectRatio"
            java.lang.Object r9 = r9.get(r2)     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
            boolean r2 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
            if (r2 == 0) goto L7f
            r2 = 0
            r6 = 0
            goto L84
        L7f:
            float r2 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
            r6 = r2
        L84:
            boolean r2 = com.google.android.gms.ads.internal.util.client.zzm.zzm(r3)     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
            if (r2 == 0) goto Lbe
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
            r2.<init>()     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
            java.lang.String r3 = "Video Meta GMSG: currentTime : "
            r2.append(r3)     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
            r2.append(r1)     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
            java.lang.String r3 = " , duration : "
            r2.append(r3)     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
            r2.append(r8)     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
            java.lang.String r3 = " , isMuted : "
            r2.append(r3)     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
            r2.append(r4)     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
            java.lang.String r3 = " , playbackState : "
            r2.append(r3)     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
            r2.append(r5)     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
            java.lang.String r3 = " , aspectRatio : "
            r2.append(r3)     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
            r2.append(r9)     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
            java.lang.String r9 = r2.toString()     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
            com.google.android.gms.ads.internal.util.client.zzm.zze(r9)     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
        Lbe:
            r2 = r8
            r3 = r5
            r5 = r6
            r0.zzc(r1, r2, r3, r4, r5)     // Catch: java.lang.NumberFormatException -> L34 java.lang.NullPointerException -> L37
            return
        Lc5:
            java.lang.String r9 = "Unable to parse videoMeta message."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r9, r8)
            com.google.android.gms.internal.ads.zzcad r9 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r0 = "VideoMetaGmsgHandler.onGmsg"
            r9.zzw(r8, r0)
            return
    }
}
