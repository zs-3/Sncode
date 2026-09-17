package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes.dex */
public final class zzco {
    public static com.google.android.gms.internal.consent_sdk.zzcm zza(android.content.Context r3, java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L7
            goto L3d
        L7:
            r0 = -1
            java.lang.String r1 = "/"
            java.lang.String[] r4 = r4.split(r1, r0)
            int r0 = r4.length
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L24
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r4 = r4[r1]
            java.lang.String r0 = "_preferences"
            java.lang.String r3 = r3.concat(r0)
            goto L2b
        L24:
            r3 = 2
            if (r0 != r3) goto L3d
            r3 = r4[r1]
            r4 = r4[r2]
        L2b:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L3d
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L3d
            com.google.android.gms.internal.consent_sdk.zzcm r0 = new com.google.android.gms.internal.consent_sdk.zzcm
            r0.<init>(r3, r4)
            return r0
        L3d:
            r3 = 0
            return r3
    }

    public static void zzb(android.content.Context r3, java.util.Set r4) {
            com.google.android.gms.internal.consent_sdk.zzcn r0 = new com.google.android.gms.internal.consent_sdk.zzcn
            r0.<init>(r3)
            java.util.Iterator r4 = r4.iterator()
        L9:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            com.google.android.gms.internal.consent_sdk.zzcm r2 = zza(r3, r1)
            if (r2 != 0) goto L2b
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "clearKeys: unable to process key: "
            java.lang.String r1 = r2.concat(r1)
            java.lang.String r2 = "UserMessagingPlatform"
            android.util.Log.d(r2, r1)
            goto L9
        L2b:
            java.lang.String r1 = r2.zza
            android.content.SharedPreferences$Editor r1 = com.google.android.gms.internal.consent_sdk.zzcn.zza(r0, r1)
            java.lang.String r2 = r2.zzb
            r1.remove(r2)
            goto L9
        L37:
            r0.zzb()
            return
    }
}
