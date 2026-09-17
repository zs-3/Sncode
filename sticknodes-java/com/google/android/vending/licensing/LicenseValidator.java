package com.google.android.vending.licensing;

/* loaded from: classes2.dex */
class LicenseValidator {
    private static final int ERROR_CONTACTING_SERVER = 257;
    private static final int ERROR_INVALID_PACKAGE_NAME = 258;
    private static final int ERROR_NON_MATCHING_UID = 259;
    private static final int ERROR_NOT_MARKET_MANAGED = 3;
    private static final int ERROR_OVER_QUOTA = 5;
    private static final int ERROR_SERVER_FAILURE = 4;
    private static final int LICENSED = 0;
    private static final int LICENSED_OLD_KEY = 2;
    private static final int NOT_LICENSED = 1;
    private static final java.lang.String SIGNATURE_ALGORITHM = "SHA1withRSA";
    private static final java.lang.String TAG = "LicenseValidator";
    private final com.google.android.vending.licensing.LicenseCheckerCallback mCallback;
    private final com.google.android.vending.licensing.DeviceLimiter mDeviceLimiter;
    private final int mNonce;
    private final java.lang.String mPackageName;
    private final com.google.android.vending.licensing.Policy mPolicy;
    private final java.lang.String mVersionCode;

    LicenseValidator(com.google.android.vending.licensing.Policy r1, com.google.android.vending.licensing.DeviceLimiter r2, com.google.android.vending.licensing.LicenseCheckerCallback r3, int r4, java.lang.String r5, java.lang.String r6) {
            r0 = this;
            r0.<init>()
            r0.mPolicy = r1
            r0.mDeviceLimiter = r2
            r0.mCallback = r3
            r0.mNonce = r4
            r0.mPackageName = r5
            r0.mVersionCode = r6
            return
    }

    private void handleApplicationError(int r2) {
            r1 = this;
            com.google.android.vending.licensing.LicenseCheckerCallback r0 = r1.mCallback
            r0.applicationError(r2)
            return
    }

    private void handleInvalidResponse() {
            r2 = this;
            com.google.android.vending.licensing.LicenseCheckerCallback r0 = r2.mCallback
            r1 = 561(0x231, float:7.86E-43)
            r0.dontAllow(r1)
            return
    }

    private void handleResponse(int r2, com.google.android.vending.licensing.ResponseData r3) {
            r1 = this;
            com.google.android.vending.licensing.Policy r0 = r1.mPolicy
            r0.processServerResponse(r2, r3)
            com.google.android.vending.licensing.Policy r3 = r1.mPolicy
            boolean r3 = r3.allowAccess()
            if (r3 == 0) goto L13
            com.google.android.vending.licensing.LicenseCheckerCallback r3 = r1.mCallback
            r3.allow(r2)
            goto L18
        L13:
            com.google.android.vending.licensing.LicenseCheckerCallback r3 = r1.mCallback
            r3.dontAllow(r2)
        L18:
            return
    }

    public com.google.android.vending.licensing.LicenseCheckerCallback getCallback() {
            r1 = this;
            com.google.android.vending.licensing.LicenseCheckerCallback r0 = r1.mCallback
            return r0
    }

    public int getNonce() {
            r1 = this;
            int r0 = r1.mNonce
            return r0
    }

    public java.lang.String getPackageName() {
            r1 = this;
            java.lang.String r0 = r1.mPackageName
            return r0
    }

    public void verify(java.security.PublicKey r7, int r8, java.lang.String r9, java.lang.String r10) {
            r6 = this;
            r0 = 5
            r1 = 0
            r2 = 2
            r3 = 1
            java.lang.String r4 = "LicenseValidator"
            if (r8 == 0) goto L10
            if (r8 == r3) goto L10
            if (r8 != r2) goto Ld
            goto L10
        Ld:
            r7 = r1
            goto L93
        L10:
            if (r9 != 0) goto L16
            r6.handleInvalidResponse()     // Catch: com.google.android.vending.licensing.util.Base64DecoderException -> Lef java.security.SignatureException -> Lf8 java.security.InvalidKeyException -> Lff java.security.NoSuchAlgorithmException -> L103
            return
        L16:
            java.lang.String r1 = "SHA1withRSA"
            java.security.Signature r1 = java.security.Signature.getInstance(r1)     // Catch: com.google.android.vending.licensing.util.Base64DecoderException -> Lef java.security.SignatureException -> Lf8 java.security.InvalidKeyException -> Lff java.security.NoSuchAlgorithmException -> L103
            r1.initVerify(r7)     // Catch: com.google.android.vending.licensing.util.Base64DecoderException -> Lef java.security.SignatureException -> Lf8 java.security.InvalidKeyException -> Lff java.security.NoSuchAlgorithmException -> L103
            byte[] r7 = r9.getBytes()     // Catch: com.google.android.vending.licensing.util.Base64DecoderException -> Lef java.security.SignatureException -> Lf8 java.security.InvalidKeyException -> Lff java.security.NoSuchAlgorithmException -> L103
            r1.update(r7)     // Catch: com.google.android.vending.licensing.util.Base64DecoderException -> Lef java.security.SignatureException -> Lf8 java.security.InvalidKeyException -> Lff java.security.NoSuchAlgorithmException -> L103
            byte[] r7 = com.google.android.vending.licensing.util.Base64.decode(r10)     // Catch: com.google.android.vending.licensing.util.Base64DecoderException -> Lef java.security.SignatureException -> Lf8 java.security.InvalidKeyException -> Lff java.security.NoSuchAlgorithmException -> L103
            boolean r7 = r1.verify(r7)     // Catch: com.google.android.vending.licensing.util.Base64DecoderException -> Lef java.security.SignatureException -> Lf8 java.security.InvalidKeyException -> Lff java.security.NoSuchAlgorithmException -> L103
            if (r7 != 0) goto L39
            java.lang.String r7 = "Signature verification failed."
            android.util.Log.e(r4, r7)     // Catch: com.google.android.vending.licensing.util.Base64DecoderException -> Lef java.security.SignatureException -> Lf8 java.security.InvalidKeyException -> Lff java.security.NoSuchAlgorithmException -> L103
            r6.handleInvalidResponse()     // Catch: com.google.android.vending.licensing.util.Base64DecoderException -> Lef java.security.SignatureException -> Lf8 java.security.InvalidKeyException -> Lff java.security.NoSuchAlgorithmException -> L103
            return
        L39:
            com.google.android.vending.licensing.ResponseData r1 = com.google.android.vending.licensing.ResponseData.parse(r9)     // Catch: java.lang.IllegalArgumentException -> Le6
            int r7 = r1.responseCode
            if (r7 == r8) goto L4a
            java.lang.String r7 = "Response codes don't match."
            android.util.Log.e(r4, r7)
            r6.handleInvalidResponse()
            return
        L4a:
            int r7 = r1.nonce
            int r9 = r6.mNonce
            if (r7 == r9) goto L59
            java.lang.String r7 = "Nonce doesn't match."
            android.util.Log.e(r4, r7)
            r6.handleInvalidResponse()
            return
        L59:
            java.lang.String r7 = r1.packageName
            java.lang.String r9 = r6.mPackageName
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L6c
            java.lang.String r7 = "Package name doesn't match."
            android.util.Log.e(r4, r7)
            r6.handleInvalidResponse()
            return
        L6c:
            java.lang.String r7 = r1.versionCode
            java.lang.String r9 = r6.mVersionCode
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L7f
            java.lang.String r7 = "Version codes don't match."
            android.util.Log.e(r4, r7)
            r6.handleInvalidResponse()
            return
        L7f:
            java.lang.String r7 = r1.userId
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            if (r9 == 0) goto L90
            java.lang.String r7 = "User identifier is empty."
            android.util.Log.e(r4, r7)
            r6.handleInvalidResponse()
            return
        L90:
            r5 = r1
            r1 = r7
            r7 = r5
        L93:
            if (r8 == 0) goto Ldc
            if (r8 == r3) goto Ld6
            if (r8 == r2) goto Ldc
            r9 = 3
            if (r8 == r9) goto Ld2
            r9 = 4
            r10 = 291(0x123, float:4.08E-43)
            if (r8 == r9) goto Lc9
            if (r8 == r0) goto Lc0
            switch(r8) {
                case 257: goto Lb7;
                case 258: goto Lb3;
                case 259: goto Laf;
                default: goto La6;
            }
        La6:
            java.lang.String r7 = "Unknown response code for license check."
            android.util.Log.e(r4, r7)
            r6.handleInvalidResponse()
            goto Le5
        Laf:
            r6.handleApplicationError(r2)
            goto Le5
        Lb3:
            r6.handleApplicationError(r3)
            goto Le5
        Lb7:
            java.lang.String r8 = "Error contacting licensing server."
            android.util.Log.w(r4, r8)
            r6.handleResponse(r10, r7)
            goto Le5
        Lc0:
            java.lang.String r8 = "Licensing server is refusing to talk to this device, over quota."
            android.util.Log.w(r4, r8)
            r6.handleResponse(r10, r7)
            goto Le5
        Lc9:
            java.lang.String r8 = "An error has occurred on the licensing server."
            android.util.Log.w(r4, r8)
            r6.handleResponse(r10, r7)
            goto Le5
        Ld2:
            r6.handleApplicationError(r9)
            goto Le5
        Ld6:
            r8 = 561(0x231, float:7.86E-43)
            r6.handleResponse(r8, r7)
            goto Le5
        Ldc:
            com.google.android.vending.licensing.DeviceLimiter r8 = r6.mDeviceLimiter
            int r8 = r8.isDeviceAllowed(r1)
            r6.handleResponse(r8, r7)
        Le5:
            return
        Le6:
            java.lang.String r7 = "Could not parse response."
            android.util.Log.e(r4, r7)
            r6.handleInvalidResponse()
            return
        Lef:
            java.lang.String r7 = "Could not Base64-decode signature."
            android.util.Log.e(r4, r7)
            r6.handleInvalidResponse()
            return
        Lf8:
            r7 = move-exception
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            r8.<init>(r7)
            throw r8
        Lff:
            r6.handleApplicationError(r0)
            return
        L103:
            r7 = move-exception
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            r8.<init>(r7)
            throw r8
    }
}
