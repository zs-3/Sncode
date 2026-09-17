package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzeh extends android.content.BroadcastReceiver {
    final /* synthetic */ com.google.android.gms.internal.ads.zzei zza;

    /* synthetic */ zzeh(com.google.android.gms.internal.ads.zzei r1, com.google.android.gms.internal.ads.zzeg r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context r9, android.content.Intent r10) {
            r8 = this;
            java.lang.String r10 = "connectivity"
            java.lang.Object r10 = r9.getSystemService(r10)
            android.net.ConnectivityManager r10 = (android.net.ConnectivityManager) r10
            r0 = 2
            r1 = 9
            r2 = 6
            r3 = 4
            r4 = 1
            r5 = 0
            r6 = 5
            if (r10 != 0) goto L14
        L12:
            r0 = 0
            goto L4f
        L14:
            android.net.NetworkInfo r10 = r10.getActiveNetworkInfo()     // Catch: java.lang.SecurityException -> L12
            if (r10 == 0) goto L4e
            boolean r7 = r10.isConnected()
            if (r7 != 0) goto L21
            goto L4e
        L21:
            int r7 = r10.getType()
            if (r7 == 0) goto L38
            if (r7 == r4) goto L4f
            if (r7 == r3) goto L38
            if (r7 == r6) goto L38
            if (r7 == r2) goto L36
            if (r7 == r1) goto L34
            r0 = 8
            goto L4f
        L34:
            r0 = 7
            goto L4f
        L36:
            r0 = 5
            goto L4f
        L38:
            int r10 = r10.getSubtype()
            switch(r10) {
                case 1: goto L4c;
                case 2: goto L4c;
                case 3: goto L4a;
                case 4: goto L4a;
                case 5: goto L4a;
                case 6: goto L4a;
                case 7: goto L4a;
                case 8: goto L4a;
                case 9: goto L4a;
                case 10: goto L4a;
                case 11: goto L4a;
                case 12: goto L4a;
                case 13: goto L36;
                case 14: goto L4a;
                case 15: goto L4a;
                case 16: goto L3f;
                case 17: goto L4a;
                case 18: goto L4f;
                case 19: goto L3f;
                case 20: goto L41;
                default: goto L3f;
            }
        L3f:
            r0 = 6
            goto L4f
        L41:
            int r10 = com.google.android.gms.internal.ads.zzeu.zza
            r0 = 29
            if (r10 < r0) goto L12
            r0 = 9
            goto L4f
        L4a:
            r0 = 4
            goto L4f
        L4c:
            r0 = 3
            goto L4f
        L4e:
            r0 = 1
        L4f:
            int r10 = com.google.android.gms.internal.ads.zzeu.zza
            r1 = 31
            if (r10 < r1) goto L78
            if (r0 != r6) goto L78
            com.google.android.gms.internal.ads.zzei r10 = r8.zza
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r9.getSystemService(r0)     // Catch: java.lang.RuntimeException -> L74
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch: java.lang.RuntimeException -> L74
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.zzef r1 = new com.google.android.gms.internal.ads.zzef     // Catch: java.lang.RuntimeException -> L74
            r1.<init>(r10)     // Catch: java.lang.RuntimeException -> L74
            java.util.concurrent.Executor r9 = r9.getMainExecutor()     // Catch: java.lang.RuntimeException -> L74
            r0.registerTelephonyCallback(r9, r1)     // Catch: java.lang.RuntimeException -> L74
            r0.unregisterTelephonyCallback(r1)     // Catch: java.lang.RuntimeException -> L74
            return
        L74:
            com.google.android.gms.internal.ads.zzei.zzc(r10, r6)
            return
        L78:
            com.google.android.gms.internal.ads.zzei r9 = r8.zza
            com.google.android.gms.internal.ads.zzei.zzc(r9, r0)
            return
    }
}
