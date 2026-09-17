package com.google.firebase.installations.local;

/* loaded from: classes2.dex */
public class PersistedInstallation {
    private java.io.File dataFile;
    private final com.google.firebase.FirebaseApp firebaseApp;

    public enum RegistrationStatus extends java.lang.Enum<com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus> {
        private static final /* synthetic */ com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus[] $VALUES = null;
        public static final com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus ATTEMPT_MIGRATION = null;
        public static final com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus NOT_GENERATED = null;
        public static final com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus REGISTERED = null;
        public static final com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus REGISTER_ERROR = null;
        public static final com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus UNREGISTERED = null;

        private static /* synthetic */ com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus[] $values() {
                r0 = 5
                com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus[] r0 = new com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus[r0]
                com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r1 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION
                r2 = 0
                r0[r2] = r1
                com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r1 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.NOT_GENERATED
                r2 = 1
                r0[r2] = r1
                com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r1 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.UNREGISTERED
                r2 = 2
                r0[r2] = r1
                com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r1 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.REGISTERED
                r2 = 3
                r0[r2] = r1
                com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r1 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.REGISTER_ERROR
                r2 = 4
                r0[r2] = r1
                return r0
        }

        static {
                com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r0 = new com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus
                java.lang.String r1 = "ATTEMPT_MIGRATION"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION = r0
                com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r0 = new com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus
                java.lang.String r1 = "NOT_GENERATED"
                r2 = 1
                r0.<init>(r1, r2)
                com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.NOT_GENERATED = r0
                com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r0 = new com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus
                java.lang.String r1 = "UNREGISTERED"
                r2 = 2
                r0.<init>(r1, r2)
                com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.UNREGISTERED = r0
                com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r0 = new com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus
                java.lang.String r1 = "REGISTERED"
                r2 = 3
                r0.<init>(r1, r2)
                com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.REGISTERED = r0
                com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r0 = new com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus
                java.lang.String r1 = "REGISTER_ERROR"
                r2 = 4
                r0.<init>(r1, r2)
                com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.REGISTER_ERROR = r0
                com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus[] r0 = $values()
                com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.$VALUES = r0
                return
        }

        RegistrationStatus(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus valueOf(java.lang.String r1) {
                java.lang.Class<com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus> r0 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r1 = (com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus) r1
                return r1
        }

        public static com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus[] values() {
                com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus[] r0 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus[] r0 = (com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus[]) r0
                return r0
        }
    }

    public PersistedInstallation(com.google.firebase.FirebaseApp r1) {
            r0 = this;
            r0.<init>()
            r0.firebaseApp = r1
            return
    }

    private java.io.File getDataFile() {
            r4 = this;
            java.io.File r0 = r4.dataFile
            if (r0 != 0) goto L3b
            monitor-enter(r4)
            java.io.File r0 = r4.dataFile     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L36
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L38
            com.google.firebase.FirebaseApp r1 = r4.firebaseApp     // Catch: java.lang.Throwable -> L38
            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L38
            java.io.File r1 = r1.getFilesDir()     // Catch: java.lang.Throwable -> L38
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r2.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = "PersistedInstallation."
            r2.append(r3)     // Catch: java.lang.Throwable -> L38
            com.google.firebase.FirebaseApp r3 = r4.firebaseApp     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = r3.getPersistenceKey()     // Catch: java.lang.Throwable -> L38
            r2.append(r3)     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = ".json"
            r2.append(r3)     // Catch: java.lang.Throwable -> L38
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L38
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L38
            r4.dataFile = r0     // Catch: java.lang.Throwable -> L38
        L36:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
            goto L3b
        L38:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
            throw r0
        L3b:
            java.io.File r0 = r4.dataFile
            return r0
    }

    private org.json.JSONObject readJSONFromFile() {
            r6 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 16384(0x4000, float:2.2959E-41)
            byte[] r2 = new byte[r1]
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L34
            java.io.File r4 = r6.getDataFile()     // Catch: java.lang.Throwable -> L34
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L34
        L12:
            r4 = 0
            int r5 = r3.read(r2, r4, r1)     // Catch: java.lang.Throwable -> L2a
            if (r5 >= 0) goto L26
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2a
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L2a
            r3.close()     // Catch: java.lang.Throwable -> L34 java.lang.Throwable -> L34
            return r1
        L26:
            r0.write(r2, r4, r5)     // Catch: java.lang.Throwable -> L2a
            goto L12
        L2a:
            r0 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L2f
            goto L33
        L2f:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch: java.lang.Throwable -> L34 java.lang.Throwable -> L34
        L33:
            throw r0     // Catch: java.lang.Throwable -> L34 java.lang.Throwable -> L34
        L34:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            return r0
    }

    public com.google.firebase.installations.local.PersistedInstallationEntry insertOrUpdatePersistedInstallationEntry(com.google.firebase.installations.local.PersistedInstallationEntry r5) {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L82
            r0.<init>()     // Catch: java.lang.Throwable -> L82
            java.lang.String r1 = "Fid"
            java.lang.String r2 = r5.getFirebaseInstallationId()     // Catch: java.lang.Throwable -> L82
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L82
            java.lang.String r1 = "Status"
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r2 = r5.getRegistrationStatus()     // Catch: java.lang.Throwable -> L82
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L82
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L82
            java.lang.String r1 = "AuthToken"
            java.lang.String r2 = r5.getAuthToken()     // Catch: java.lang.Throwable -> L82
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L82
            java.lang.String r1 = "RefreshToken"
            java.lang.String r2 = r5.getRefreshToken()     // Catch: java.lang.Throwable -> L82
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L82
            java.lang.String r1 = "TokenCreationEpochInSecs"
            long r2 = r5.getTokenCreationEpochInSecs()     // Catch: java.lang.Throwable -> L82
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L82
            java.lang.String r1 = "ExpiresInSecs"
            long r2 = r5.getExpiresInSecs()     // Catch: java.lang.Throwable -> L82
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L82
            java.lang.String r1 = "FisError"
            java.lang.String r2 = r5.getFisError()     // Catch: java.lang.Throwable -> L82
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L82
            java.lang.String r1 = "PersistedInstallation"
            java.lang.String r2 = "tmp"
            com.google.firebase.FirebaseApp r3 = r4.firebaseApp     // Catch: java.lang.Throwable -> L82
            android.content.Context r3 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L82
            java.io.File r3 = r3.getFilesDir()     // Catch: java.lang.Throwable -> L82
            java.io.File r1 = java.io.File.createTempFile(r1, r2, r3)     // Catch: java.lang.Throwable -> L82
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L82
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L82
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L82
            java.lang.String r3 = "UTF-8"
            byte[] r0 = r0.getBytes(r3)     // Catch: java.lang.Throwable -> L82
            r2.write(r0)     // Catch: java.lang.Throwable -> L82
            r2.close()     // Catch: java.lang.Throwable -> L82
            java.io.File r0 = r4.getDataFile()     // Catch: java.lang.Throwable -> L82
            boolean r0 = r1.renameTo(r0)     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L7a
            goto L82
        L7a:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L82
            java.lang.String r1 = "unable to rename the tmpfile to PersistedInstallation"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L82
            throw r0     // Catch: java.lang.Throwable -> L82
        L82:
            return r5
    }

    public com.google.firebase.installations.local.PersistedInstallationEntry readPersistedInstallationEntryValue() {
            r11 = this;
            org.json.JSONObject r0 = r11.readJSONFromFile()
            java.lang.String r1 = "Fid"
            r2 = 0
            java.lang.String r1 = r0.optString(r1, r2)
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r3 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION
            int r3 = r3.ordinal()
            java.lang.String r4 = "Status"
            int r3 = r0.optInt(r4, r3)
            java.lang.String r4 = "AuthToken"
            java.lang.String r4 = r0.optString(r4, r2)
            java.lang.String r5 = "RefreshToken"
            java.lang.String r5 = r0.optString(r5, r2)
            java.lang.String r6 = "TokenCreationEpochInSecs"
            r7 = 0
            long r9 = r0.optLong(r6, r7)
            java.lang.String r6 = "ExpiresInSecs"
            long r6 = r0.optLong(r6, r7)
            java.lang.String r8 = "FisError"
            java.lang.String r0 = r0.optString(r8, r2)
            com.google.firebase.installations.local.PersistedInstallationEntry$Builder r2 = com.google.firebase.installations.local.PersistedInstallationEntry.builder()
            com.google.firebase.installations.local.PersistedInstallationEntry$Builder r1 = r2.setFirebaseInstallationId(r1)
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus[] r2 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.values()
            r2 = r2[r3]
            com.google.firebase.installations.local.PersistedInstallationEntry$Builder r1 = r1.setRegistrationStatus(r2)
            com.google.firebase.installations.local.PersistedInstallationEntry$Builder r1 = r1.setAuthToken(r4)
            com.google.firebase.installations.local.PersistedInstallationEntry$Builder r1 = r1.setRefreshToken(r5)
            com.google.firebase.installations.local.PersistedInstallationEntry$Builder r1 = r1.setTokenCreationEpochInSecs(r9)
            com.google.firebase.installations.local.PersistedInstallationEntry$Builder r1 = r1.setExpiresInSecs(r6)
            com.google.firebase.installations.local.PersistedInstallationEntry$Builder r0 = r1.setFisError(r0)
            com.google.firebase.installations.local.PersistedInstallationEntry r0 = r0.build()
            return r0
    }
}
