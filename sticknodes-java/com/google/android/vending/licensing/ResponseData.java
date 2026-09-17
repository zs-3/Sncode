package com.google.android.vending.licensing;

/* loaded from: classes2.dex */
public class ResponseData {
    public java.lang.String extra;
    public int nonce;
    public java.lang.String packageName;
    public int responseCode;
    public long timestamp;
    public java.lang.String userId;
    public java.lang.String versionCode;

    public ResponseData() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.vending.licensing.ResponseData parse(java.lang.String r6) {
            r0 = 58
            int r0 = r6.indexOf(r0)
            r1 = 1
            java.lang.String r2 = ""
            r3 = 0
            r4 = -1
            if (r4 != r0) goto Le
            goto L20
        Le:
            java.lang.String r4 = r6.substring(r3, r0)
            int r5 = r6.length()
            if (r0 < r5) goto L19
            goto L1f
        L19:
            int r0 = r0 + r1
            java.lang.String r6 = r6.substring(r0)
            r2 = r6
        L1f:
            r6 = r4
        L20:
            java.lang.String r0 = "|"
            java.lang.String r0 = java.util.regex.Pattern.quote(r0)
            java.lang.String[] r6 = android.text.TextUtils.split(r6, r0)
            int r0 = r6.length
            r4 = 6
            if (r0 < r4) goto L5e
            com.google.android.vending.licensing.ResponseData r0 = new com.google.android.vending.licensing.ResponseData
            r0.<init>()
            r0.extra = r2
            r2 = r6[r3]
            int r2 = java.lang.Integer.parseInt(r2)
            r0.responseCode = r2
            r1 = r6[r1]
            int r1 = java.lang.Integer.parseInt(r1)
            r0.nonce = r1
            r1 = 2
            r1 = r6[r1]
            r0.packageName = r1
            r1 = 3
            r1 = r6[r1]
            r0.versionCode = r1
            r1 = 4
            r1 = r6[r1]
            r0.userId = r1
            r1 = 5
            r6 = r6[r1]
            long r1 = java.lang.Long.parseLong(r6)
            r0.timestamp = r1
            return r0
        L5e:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Wrong number of fields."
            r6.<init>(r0)
            throw r6
    }

    public java.lang.String toString() {
            r3 = this;
            r0 = 6
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r3.responseCode
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            int r1 = r3.nonce
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = r3.packageName
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = r3.versionCode
            r2 = 3
            r0[r2] = r1
            java.lang.String r1 = r3.userId
            r2 = 4
            r0[r2] = r1
            long r1 = r3.timestamp
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 5
            r0[r2] = r1
            java.lang.String r1 = "|"
            java.lang.String r0 = android.text.TextUtils.join(r1, r0)
            return r0
    }
}
