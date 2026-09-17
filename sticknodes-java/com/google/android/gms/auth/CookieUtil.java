package com.google.android.gms.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public final class CookieUtil {
    private CookieUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getCookieUrl(java.lang.String r1, java.lang.Boolean r2) {
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r1)
            boolean r2 = zza(r2)
            r0 = 1
            if (r0 == r2) goto Ld
            java.lang.String r2 = "http"
            goto Lf
        Ld:
            java.lang.String r2 = "https"
        Lf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = "://"
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String getCookieValue(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.Boolean r5, java.lang.Boolean r6, java.lang.Long r7) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            if (r1 != 0) goto L6
            java.lang.String r1 = ""
        L6:
            r0.<init>(r1)
            r1 = 61
            r0.append(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L17
            r0.append(r2)
        L17:
            boolean r1 = zza(r5)
            if (r1 == 0) goto L22
            java.lang.String r1 = ";HttpOnly"
            r0.append(r1)
        L22:
            boolean r1 = zza(r6)
            if (r1 == 0) goto L2d
            java.lang.String r1 = ";Secure"
            r0.append(r1)
        L2d:
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L3b
            java.lang.String r1 = ";Domain="
            r0.append(r1)
            r0.append(r3)
        L3b:
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L49
            java.lang.String r1 = ";Path="
            r0.append(r1)
            r0.append(r4)
        L49:
            if (r7 == 0) goto L5d
            long r1 = r7.longValue()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L5d
            java.lang.String r1 = ";Max-Age="
            r0.append(r1)
            r0.append(r7)
        L5d:
            r1 = 0
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L69
            java.lang.String r2 = ";Priority=null"
            r0.append(r2)
        L69:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L74
            java.lang.String r2 = ";SameSite=null"
            r0.append(r2)
        L74:
            boolean r1 = zza(r1)
            if (r1 == 0) goto L7f
            java.lang.String r1 = ";SameParty"
            r0.append(r1)
        L7f:
            java.lang.String r1 = r0.toString()
            return r1
    }

    private static boolean zza(java.lang.Boolean r0) {
            if (r0 == 0) goto La
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }
}
