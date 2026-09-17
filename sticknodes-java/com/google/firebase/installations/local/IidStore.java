package com.google.firebase.installations.local;

/* loaded from: classes2.dex */
public class IidStore {
    private static final java.lang.String[] ALLOWABLE_SCOPES = null;
    private final java.lang.String defaultSenderId;
    private final android.content.SharedPreferences iidPrefs;

    static {
            java.lang.String r0 = "*"
            java.lang.String r1 = "FCM"
            java.lang.String r2 = "GCM"
            java.lang.String r3 = ""
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3}
            com.google.firebase.installations.local.IidStore.ALLOWABLE_SCOPES = r0
            return
    }

    public IidStore(com.google.firebase.FirebaseApp r4) {
            r3 = this;
            r3.<init>()
            android.content.Context r0 = r4.getApplicationContext()
            java.lang.String r1 = "com.google.android.gms.appid"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            r3.iidPrefs = r0
            java.lang.String r4 = getDefaultSenderId(r4)
            r3.defaultSenderId = r4
            return
    }

    private java.lang.String createTokenKey(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "|T|"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "|"
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            return r3
    }

    private static java.lang.String getDefaultSenderId(com.google.firebase.FirebaseApp r3) {
            com.google.firebase.FirebaseOptions r0 = r3.getOptions()
            java.lang.String r0 = r0.getGcmSenderId()
            if (r0 == 0) goto Lb
            return r0
        Lb:
            com.google.firebase.FirebaseOptions r3 = r3.getOptions()
            java.lang.String r3 = r3.getApplicationId()
            java.lang.String r0 = "1:"
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L24
            java.lang.String r0 = "2:"
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L24
            return r3
        L24:
            java.lang.String r0 = ":"
            java.lang.String[] r3 = r3.split(r0)
            int r0 = r3.length
            r1 = 4
            r2 = 0
            if (r0 == r1) goto L30
            return r2
        L30:
            r0 = 1
            r3 = r3[r0]
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L3a
            return r2
        L3a:
            return r3
    }

    private static java.lang.String getIdFromPublicKey(java.security.PublicKey r3) {
            byte[] r3 = r3.getEncoded()
            java.lang.String r0 = "SHA1"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L23
            byte[] r3 = r0.digest(r3)     // Catch: java.security.NoSuchAlgorithmException -> L23
            r0 = 0
            r1 = r3[r0]     // Catch: java.security.NoSuchAlgorithmException -> L23
            r1 = r1 & 15
            int r1 = r1 + 112
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1     // Catch: java.security.NoSuchAlgorithmException -> L23
            r3[r0] = r1     // Catch: java.security.NoSuchAlgorithmException -> L23
            r1 = 8
            r2 = 11
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r0, r1, r2)     // Catch: java.security.NoSuchAlgorithmException -> L23
            return r3
        L23:
            java.lang.String r3 = "ContentValues"
            java.lang.String r0 = "Unexpected error, device missing required algorithms"
            android.util.Log.w(r3, r0)
            r3 = 0
            return r3
    }

    private java.lang.String parseIidTokenFromJson(java.lang.String r2) {
            r1 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lc
            r0.<init>(r2)     // Catch: org.json.JSONException -> Lc
            java.lang.String r2 = "token"
            java.lang.String r2 = r0.getString(r2)     // Catch: org.json.JSONException -> Lc
            return r2
        Lc:
            r2 = 0
            return r2
    }

    private java.security.PublicKey parseKey(java.lang.String r3) {
            r2 = this;
            r0 = 8
            byte[] r3 = android.util.Base64.decode(r3, r0)     // Catch: java.security.NoSuchAlgorithmException -> L16 java.security.spec.InvalidKeySpecException -> L18 java.lang.IllegalArgumentException -> L1a
            java.lang.String r0 = "RSA"
            java.security.KeyFactory r0 = java.security.KeyFactory.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L16 java.security.spec.InvalidKeySpecException -> L18 java.lang.IllegalArgumentException -> L1a
            java.security.spec.X509EncodedKeySpec r1 = new java.security.spec.X509EncodedKeySpec     // Catch: java.security.NoSuchAlgorithmException -> L16 java.security.spec.InvalidKeySpecException -> L18 java.lang.IllegalArgumentException -> L1a
            r1.<init>(r3)     // Catch: java.security.NoSuchAlgorithmException -> L16 java.security.spec.InvalidKeySpecException -> L18 java.lang.IllegalArgumentException -> L1a
            java.security.PublicKey r3 = r0.generatePublic(r1)     // Catch: java.security.NoSuchAlgorithmException -> L16 java.security.spec.InvalidKeySpecException -> L18 java.lang.IllegalArgumentException -> L1a
            return r3
        L16:
            r3 = move-exception
            goto L1b
        L18:
            r3 = move-exception
            goto L1b
        L1a:
            r3 = move-exception
        L1b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid key stored "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "ContentValues"
            android.util.Log.w(r0, r3)
            r3 = 0
            return r3
    }

    private java.lang.String readInstanceIdFromLocalStorage() {
            r4 = this;
            android.content.SharedPreferences r0 = r4.iidPrefs
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r4.iidPrefs     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = "|S|id"
            r3 = 0
            java.lang.String r1 = r1.getString(r2, r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    private java.lang.String readPublicKeyFromLocalStorageAndCalculateInstanceId() {
            r4 = this;
            android.content.SharedPreferences r0 = r4.iidPrefs
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r4.iidPrefs     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = "|S||P|"
            r3 = 0
            java.lang.String r1 = r1.getString(r2, r3)     // Catch: java.lang.Throwable -> L1e
            if (r1 != 0) goto L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return r3
        L10:
            java.security.PublicKey r1 = r4.parseKey(r1)     // Catch: java.lang.Throwable -> L1e
            if (r1 != 0) goto L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return r3
        L18:
            java.lang.String r1 = getIdFromPublicKey(r1)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return r1
        L1e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r1
    }

    public java.lang.String readIid() {
            r2 = this;
            android.content.SharedPreferences r0 = r2.iidPrefs
            monitor-enter(r0)
            java.lang.String r1 = r2.readInstanceIdFromLocalStorage()     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r1
        Lb:
            java.lang.String r1 = r2.readPublicKeyFromLocalStorageAndCalculateInstanceId()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r1
        L11:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    public java.lang.String readToken() {
            r7 = this;
            android.content.SharedPreferences r0 = r7.iidPrefs
            monitor-enter(r0)
            java.lang.String[] r1 = com.google.firebase.installations.local.IidStore.ALLOWABLE_SCOPES     // Catch: java.lang.Throwable -> L33
            int r2 = r1.length     // Catch: java.lang.Throwable -> L33
            r3 = 0
        L7:
            r4 = 0
            if (r3 >= r2) goto L31
            r5 = r1[r3]     // Catch: java.lang.Throwable -> L33
            java.lang.String r6 = r7.defaultSenderId     // Catch: java.lang.Throwable -> L33
            java.lang.String r5 = r7.createTokenKey(r6, r5)     // Catch: java.lang.Throwable -> L33
            android.content.SharedPreferences r6 = r7.iidPrefs     // Catch: java.lang.Throwable -> L33
            java.lang.String r4 = r6.getString(r5, r4)     // Catch: java.lang.Throwable -> L33
            if (r4 == 0) goto L2e
            boolean r5 = r4.isEmpty()     // Catch: java.lang.Throwable -> L33
            if (r5 != 0) goto L2e
            java.lang.String r1 = "{"
            boolean r1 = r4.startsWith(r1)     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L2c
            java.lang.String r4 = r7.parseIidTokenFromJson(r4)     // Catch: java.lang.Throwable -> L33
        L2c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            return r4
        L2e:
            int r3 = r3 + 1
            goto L7
        L31:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            return r4
        L33:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            throw r1
    }
}
