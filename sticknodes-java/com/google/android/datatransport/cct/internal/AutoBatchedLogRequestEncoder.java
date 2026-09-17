package com.google.android.datatransport.cct.internal;

/* loaded from: classes.dex */
public final class AutoBatchedLogRequestEncoder implements com.google.firebase.encoders.config.Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final com.google.firebase.encoders.config.Configurator CONFIG = null;

    private static final class AndroidClientInfoEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.cct.internal.AndroidClientInfo> {
        private static final com.google.firebase.encoders.FieldDescriptor APPLICATIONBUILD_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor COUNTRY_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor DEVICE_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor FINGERPRINT_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor HARDWARE_DESCRIPTOR = null;
        static final com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor LOCALE_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor MANUFACTURER_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor MCCMNC_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor MODEL_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor OSBUILD_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor PRODUCT_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor SDKVERSION_DESCRIPTOR = null;

        static {
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$AndroidClientInfoEncoder r0 = new com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$AndroidClientInfoEncoder
                r0.<init>()
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.INSTANCE = r0
                java.lang.String r0 = "sdkVersion"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.SDKVERSION_DESCRIPTOR = r0
                java.lang.String r0 = "model"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.MODEL_DESCRIPTOR = r0
                java.lang.String r0 = "hardware"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.HARDWARE_DESCRIPTOR = r0
                java.lang.String r0 = "device"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.DEVICE_DESCRIPTOR = r0
                java.lang.String r0 = "product"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.PRODUCT_DESCRIPTOR = r0
                java.lang.String r0 = "osBuild"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.OSBUILD_DESCRIPTOR = r0
                java.lang.String r0 = "manufacturer"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.MANUFACTURER_DESCRIPTOR = r0
                java.lang.String r0 = "fingerprint"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.FINGERPRINT_DESCRIPTOR = r0
                java.lang.String r0 = "locale"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.LOCALE_DESCRIPTOR = r0
                java.lang.String r0 = "country"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.COUNTRY_DESCRIPTOR = r0
                java.lang.String r0 = "mccMnc"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.MCCMNC_DESCRIPTOR = r0
                java.lang.String r0 = "applicationBuild"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.APPLICATIONBUILD_DESCRIPTOR = r0
                return
        }

        private AndroidClientInfoEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.android.datatransport.cct.internal.AndroidClientInfo r3, com.google.firebase.encoders.ObjectEncoderContext r4) throws java.io.IOException {
                r2 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.SDKVERSION_DESCRIPTOR
                java.lang.Integer r1 = r3.getSdkVersion()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.MODEL_DESCRIPTOR
                java.lang.String r1 = r3.getModel()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.HARDWARE_DESCRIPTOR
                java.lang.String r1 = r3.getHardware()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.DEVICE_DESCRIPTOR
                java.lang.String r1 = r3.getDevice()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.PRODUCT_DESCRIPTOR
                java.lang.String r1 = r3.getProduct()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.OSBUILD_DESCRIPTOR
                java.lang.String r1 = r3.getOsBuild()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.MANUFACTURER_DESCRIPTOR
                java.lang.String r1 = r3.getManufacturer()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.FINGERPRINT_DESCRIPTOR
                java.lang.String r1 = r3.getFingerprint()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.LOCALE_DESCRIPTOR
                java.lang.String r1 = r3.getLocale()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.COUNTRY_DESCRIPTOR
                java.lang.String r1 = r3.getCountry()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.MCCMNC_DESCRIPTOR
                java.lang.String r1 = r3.getMccMnc()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.APPLICATIONBUILD_DESCRIPTOR
                java.lang.String r3 = r3.getApplicationBuild()
                r4.add(r0, r3)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.android.datatransport.cct.internal.AndroidClientInfo r1 = (com.google.android.datatransport.cct.internal.AndroidClientInfo) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class BatchedLogRequestEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.cct.internal.BatchedLogRequest> {
        static final com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.BatchedLogRequestEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor LOGREQUEST_DESCRIPTOR = null;

        static {
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$BatchedLogRequestEncoder r0 = new com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$BatchedLogRequestEncoder
                r0.<init>()
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.BatchedLogRequestEncoder.INSTANCE = r0
                java.lang.String r0 = "logRequest"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.BatchedLogRequestEncoder.LOGREQUEST_DESCRIPTOR = r0
                return
        }

        private BatchedLogRequestEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.android.datatransport.cct.internal.BatchedLogRequest r2, com.google.firebase.encoders.ObjectEncoderContext r3) throws java.io.IOException {
                r1 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.BatchedLogRequestEncoder.LOGREQUEST_DESCRIPTOR
                java.util.List r2 = r2.getLogRequests()
                r3.add(r0, r2)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.android.datatransport.cct.internal.BatchedLogRequest r1 = (com.google.android.datatransport.cct.internal.BatchedLogRequest) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class ClientInfoEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.cct.internal.ClientInfo> {
        private static final com.google.firebase.encoders.FieldDescriptor ANDROIDCLIENTINFO_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor CLIENTTYPE_DESCRIPTOR = null;
        static final com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ClientInfoEncoder INSTANCE = null;

        static {
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$ClientInfoEncoder r0 = new com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$ClientInfoEncoder
                r0.<init>()
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ClientInfoEncoder.INSTANCE = r0
                java.lang.String r0 = "clientType"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ClientInfoEncoder.CLIENTTYPE_DESCRIPTOR = r0
                java.lang.String r0 = "androidClientInfo"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ClientInfoEncoder.ANDROIDCLIENTINFO_DESCRIPTOR = r0
                return
        }

        private ClientInfoEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.android.datatransport.cct.internal.ClientInfo r3, com.google.firebase.encoders.ObjectEncoderContext r4) throws java.io.IOException {
                r2 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ClientInfoEncoder.CLIENTTYPE_DESCRIPTOR
                com.google.android.datatransport.cct.internal.ClientInfo$ClientType r1 = r3.getClientType()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ClientInfoEncoder.ANDROIDCLIENTINFO_DESCRIPTOR
                com.google.android.datatransport.cct.internal.AndroidClientInfo r3 = r3.getAndroidClientInfo()
                r4.add(r0, r3)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.android.datatransport.cct.internal.ClientInfo r1 = (com.google.android.datatransport.cct.internal.ClientInfo) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class ComplianceDataEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.cct.internal.ComplianceData> {
        static final com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ComplianceDataEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor PRIVACYCONTEXT_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor PRODUCTIDORIGIN_DESCRIPTOR = null;

        static {
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$ComplianceDataEncoder r0 = new com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$ComplianceDataEncoder
                r0.<init>()
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ComplianceDataEncoder.INSTANCE = r0
                java.lang.String r0 = "privacyContext"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ComplianceDataEncoder.PRIVACYCONTEXT_DESCRIPTOR = r0
                java.lang.String r0 = "productIdOrigin"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ComplianceDataEncoder.PRODUCTIDORIGIN_DESCRIPTOR = r0
                return
        }

        private ComplianceDataEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.android.datatransport.cct.internal.ComplianceData r3, com.google.firebase.encoders.ObjectEncoderContext r4) throws java.io.IOException {
                r2 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ComplianceDataEncoder.PRIVACYCONTEXT_DESCRIPTOR
                com.google.android.datatransport.cct.internal.ExternalPrivacyContext r1 = r3.getPrivacyContext()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ComplianceDataEncoder.PRODUCTIDORIGIN_DESCRIPTOR
                com.google.android.datatransport.cct.internal.ComplianceData$ProductIdOrigin r3 = r3.getProductIdOrigin()
                r4.add(r0, r3)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.android.datatransport.cct.internal.ComplianceData r1 = (com.google.android.datatransport.cct.internal.ComplianceData) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class ExperimentIdsEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.cct.internal.ExperimentIds> {
        private static final com.google.firebase.encoders.FieldDescriptor CLEARBLOB_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor ENCRYPTEDBLOB_DESCRIPTOR = null;
        static final com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ExperimentIdsEncoder INSTANCE = null;

        static {
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$ExperimentIdsEncoder r0 = new com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$ExperimentIdsEncoder
                r0.<init>()
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ExperimentIdsEncoder.INSTANCE = r0
                java.lang.String r0 = "clearBlob"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ExperimentIdsEncoder.CLEARBLOB_DESCRIPTOR = r0
                java.lang.String r0 = "encryptedBlob"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ExperimentIdsEncoder.ENCRYPTEDBLOB_DESCRIPTOR = r0
                return
        }

        private ExperimentIdsEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.android.datatransport.cct.internal.ExperimentIds r3, com.google.firebase.encoders.ObjectEncoderContext r4) throws java.io.IOException {
                r2 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ExperimentIdsEncoder.CLEARBLOB_DESCRIPTOR
                byte[] r1 = r3.getClearBlob()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ExperimentIdsEncoder.ENCRYPTEDBLOB_DESCRIPTOR
                byte[] r3 = r3.getEncryptedBlob()
                r4.add(r0, r3)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.android.datatransport.cct.internal.ExperimentIds r1 = (com.google.android.datatransport.cct.internal.ExperimentIds) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class ExternalPRequestContextEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.cct.internal.ExternalPRequestContext> {
        static final com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ExternalPRequestContextEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor ORIGINASSOCIATEDPRODUCTID_DESCRIPTOR = null;

        static {
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$ExternalPRequestContextEncoder r0 = new com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$ExternalPRequestContextEncoder
                r0.<init>()
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ExternalPRequestContextEncoder.INSTANCE = r0
                java.lang.String r0 = "originAssociatedProductId"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ExternalPRequestContextEncoder.ORIGINASSOCIATEDPRODUCTID_DESCRIPTOR = r0
                return
        }

        private ExternalPRequestContextEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.android.datatransport.cct.internal.ExternalPRequestContext r2, com.google.firebase.encoders.ObjectEncoderContext r3) throws java.io.IOException {
                r1 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ExternalPRequestContextEncoder.ORIGINASSOCIATEDPRODUCTID_DESCRIPTOR
                java.lang.Integer r2 = r2.getOriginAssociatedProductId()
                r3.add(r0, r2)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.android.datatransport.cct.internal.ExternalPRequestContext r1 = (com.google.android.datatransport.cct.internal.ExternalPRequestContext) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class ExternalPrivacyContextEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.cct.internal.ExternalPrivacyContext> {
        static final com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ExternalPrivacyContextEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor PREQUEST_DESCRIPTOR = null;

        static {
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$ExternalPrivacyContextEncoder r0 = new com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$ExternalPrivacyContextEncoder
                r0.<init>()
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ExternalPrivacyContextEncoder.INSTANCE = r0
                java.lang.String r0 = "prequest"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ExternalPrivacyContextEncoder.PREQUEST_DESCRIPTOR = r0
                return
        }

        private ExternalPrivacyContextEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.android.datatransport.cct.internal.ExternalPrivacyContext r2, com.google.firebase.encoders.ObjectEncoderContext r3) throws java.io.IOException {
                r1 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ExternalPrivacyContextEncoder.PREQUEST_DESCRIPTOR
                com.google.android.datatransport.cct.internal.ExternalPRequestContext r2 = r2.getPrequest()
                r3.add(r0, r2)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.android.datatransport.cct.internal.ExternalPrivacyContext r1 = (com.google.android.datatransport.cct.internal.ExternalPrivacyContext) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class LogEventEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.cct.internal.LogEvent> {
        private static final com.google.firebase.encoders.FieldDescriptor COMPLIANCEDATA_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor EVENTCODE_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor EVENTTIMEMS_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor EVENTUPTIMEMS_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor EXPERIMENTIDS_DESCRIPTOR = null;
        static final com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor NETWORKCONNECTIONINFO_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor SOURCEEXTENSIONJSONPROTO3_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor SOURCEEXTENSION_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor TIMEZONEOFFSETSECONDS_DESCRIPTOR = null;

        static {
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$LogEventEncoder r0 = new com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$LogEventEncoder
                r0.<init>()
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder.INSTANCE = r0
                java.lang.String r0 = "eventTimeMs"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder.EVENTTIMEMS_DESCRIPTOR = r0
                java.lang.String r0 = "eventCode"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder.EVENTCODE_DESCRIPTOR = r0
                java.lang.String r0 = "complianceData"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder.COMPLIANCEDATA_DESCRIPTOR = r0
                java.lang.String r0 = "eventUptimeMs"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder.EVENTUPTIMEMS_DESCRIPTOR = r0
                java.lang.String r0 = "sourceExtension"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder.SOURCEEXTENSION_DESCRIPTOR = r0
                java.lang.String r0 = "sourceExtensionJsonProto3"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder.SOURCEEXTENSIONJSONPROTO3_DESCRIPTOR = r0
                java.lang.String r0 = "timezoneOffsetSeconds"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder.TIMEZONEOFFSETSECONDS_DESCRIPTOR = r0
                java.lang.String r0 = "networkConnectionInfo"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder.NETWORKCONNECTIONINFO_DESCRIPTOR = r0
                java.lang.String r0 = "experimentIds"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder.EXPERIMENTIDS_DESCRIPTOR = r0
                return
        }

        private LogEventEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.android.datatransport.cct.internal.LogEvent r4, com.google.firebase.encoders.ObjectEncoderContext r5) throws java.io.IOException {
                r3 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder.EVENTTIMEMS_DESCRIPTOR
                long r1 = r4.getEventTimeMs()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder.EVENTCODE_DESCRIPTOR
                java.lang.Integer r1 = r4.getEventCode()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder.COMPLIANCEDATA_DESCRIPTOR
                com.google.android.datatransport.cct.internal.ComplianceData r1 = r4.getComplianceData()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder.EVENTUPTIMEMS_DESCRIPTOR
                long r1 = r4.getEventUptimeMs()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder.SOURCEEXTENSION_DESCRIPTOR
                byte[] r1 = r4.getSourceExtension()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder.SOURCEEXTENSIONJSONPROTO3_DESCRIPTOR
                java.lang.String r1 = r4.getSourceExtensionJsonProto3()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder.TIMEZONEOFFSETSECONDS_DESCRIPTOR
                long r1 = r4.getTimezoneOffsetSeconds()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder.NETWORKCONNECTIONINFO_DESCRIPTOR
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo r1 = r4.getNetworkConnectionInfo()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder.EXPERIMENTIDS_DESCRIPTOR
                com.google.android.datatransport.cct.internal.ExperimentIds r4 = r4.getExperimentIds()
                r5.add(r0, r4)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.android.datatransport.cct.internal.LogEvent r1 = (com.google.android.datatransport.cct.internal.LogEvent) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class LogRequestEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.cct.internal.LogRequest> {
        private static final com.google.firebase.encoders.FieldDescriptor CLIENTINFO_DESCRIPTOR = null;
        static final com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogRequestEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor LOGEVENT_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor LOGSOURCENAME_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor LOGSOURCE_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor QOSTIER_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor REQUESTTIMEMS_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor REQUESTUPTIMEMS_DESCRIPTOR = null;

        static {
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$LogRequestEncoder r0 = new com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$LogRequestEncoder
                r0.<init>()
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogRequestEncoder.INSTANCE = r0
                java.lang.String r0 = "requestTimeMs"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogRequestEncoder.REQUESTTIMEMS_DESCRIPTOR = r0
                java.lang.String r0 = "requestUptimeMs"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogRequestEncoder.REQUESTUPTIMEMS_DESCRIPTOR = r0
                java.lang.String r0 = "clientInfo"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogRequestEncoder.CLIENTINFO_DESCRIPTOR = r0
                java.lang.String r0 = "logSource"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogRequestEncoder.LOGSOURCE_DESCRIPTOR = r0
                java.lang.String r0 = "logSourceName"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogRequestEncoder.LOGSOURCENAME_DESCRIPTOR = r0
                java.lang.String r0 = "logEvent"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogRequestEncoder.LOGEVENT_DESCRIPTOR = r0
                java.lang.String r0 = "qosTier"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogRequestEncoder.QOSTIER_DESCRIPTOR = r0
                return
        }

        private LogRequestEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.android.datatransport.cct.internal.LogRequest r4, com.google.firebase.encoders.ObjectEncoderContext r5) throws java.io.IOException {
                r3 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogRequestEncoder.REQUESTTIMEMS_DESCRIPTOR
                long r1 = r4.getRequestTimeMs()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogRequestEncoder.REQUESTUPTIMEMS_DESCRIPTOR
                long r1 = r4.getRequestUptimeMs()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogRequestEncoder.CLIENTINFO_DESCRIPTOR
                com.google.android.datatransport.cct.internal.ClientInfo r1 = r4.getClientInfo()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogRequestEncoder.LOGSOURCE_DESCRIPTOR
                java.lang.Integer r1 = r4.getLogSource()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogRequestEncoder.LOGSOURCENAME_DESCRIPTOR
                java.lang.String r1 = r4.getLogSourceName()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogRequestEncoder.LOGEVENT_DESCRIPTOR
                java.util.List r1 = r4.getLogEvents()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogRequestEncoder.QOSTIER_DESCRIPTOR
                com.google.android.datatransport.cct.internal.QosTier r4 = r4.getQosTier()
                r5.add(r0, r4)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.android.datatransport.cct.internal.LogRequest r1 = (com.google.android.datatransport.cct.internal.LogRequest) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class NetworkConnectionInfoEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.cct.internal.NetworkConnectionInfo> {
        static final com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.NetworkConnectionInfoEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor MOBILESUBTYPE_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor NETWORKTYPE_DESCRIPTOR = null;

        static {
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$NetworkConnectionInfoEncoder r0 = new com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$NetworkConnectionInfoEncoder
                r0.<init>()
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.NetworkConnectionInfoEncoder.INSTANCE = r0
                java.lang.String r0 = "networkType"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.NetworkConnectionInfoEncoder.NETWORKTYPE_DESCRIPTOR = r0
                java.lang.String r0 = "mobileSubtype"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.NetworkConnectionInfoEncoder.MOBILESUBTYPE_DESCRIPTOR = r0
                return
        }

        private NetworkConnectionInfoEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.android.datatransport.cct.internal.NetworkConnectionInfo r3, com.google.firebase.encoders.ObjectEncoderContext r4) throws java.io.IOException {
                r2 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.NetworkConnectionInfoEncoder.NETWORKTYPE_DESCRIPTOR
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType r1 = r3.getNetworkType()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.NetworkConnectionInfoEncoder.MOBILESUBTYPE_DESCRIPTOR
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype r3 = r3.getMobileSubtype()
                r4.add(r0, r3)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo r1 = (com.google.android.datatransport.cct.internal.NetworkConnectionInfo) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    static {
            com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder r0 = new com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder
            r0.<init>()
            com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.CONFIG = r0
            return
    }

    private AutoBatchedLogRequestEncoder() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(com.google.firebase.encoders.config.EncoderConfig<?> r3) {
            r2 = this;
            java.lang.Class<com.google.android.datatransport.cct.internal.BatchedLogRequest> r0 = com.google.android.datatransport.cct.internal.BatchedLogRequest.class
            com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$BatchedLogRequestEncoder r1 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.BatchedLogRequestEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.android.datatransport.cct.internal.AutoValue_BatchedLogRequest> r0 = com.google.android.datatransport.cct.internal.AutoValue_BatchedLogRequest.class
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.android.datatransport.cct.internal.LogRequest> r0 = com.google.android.datatransport.cct.internal.LogRequest.class
            com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$LogRequestEncoder r1 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogRequestEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.android.datatransport.cct.internal.AutoValue_LogRequest> r0 = com.google.android.datatransport.cct.internal.AutoValue_LogRequest.class
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.android.datatransport.cct.internal.ClientInfo> r0 = com.google.android.datatransport.cct.internal.ClientInfo.class
            com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$ClientInfoEncoder r1 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ClientInfoEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.android.datatransport.cct.internal.AutoValue_ClientInfo> r0 = com.google.android.datatransport.cct.internal.AutoValue_ClientInfo.class
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.android.datatransport.cct.internal.AndroidClientInfo> r0 = com.google.android.datatransport.cct.internal.AndroidClientInfo.class
            com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$AndroidClientInfoEncoder r1 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.AndroidClientInfoEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.android.datatransport.cct.internal.AutoValue_AndroidClientInfo> r0 = com.google.android.datatransport.cct.internal.AutoValue_AndroidClientInfo.class
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.android.datatransport.cct.internal.LogEvent> r0 = com.google.android.datatransport.cct.internal.LogEvent.class
            com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$LogEventEncoder r1 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.LogEventEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.android.datatransport.cct.internal.AutoValue_LogEvent> r0 = com.google.android.datatransport.cct.internal.AutoValue_LogEvent.class
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.android.datatransport.cct.internal.ComplianceData> r0 = com.google.android.datatransport.cct.internal.ComplianceData.class
            com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$ComplianceDataEncoder r1 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ComplianceDataEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.android.datatransport.cct.internal.AutoValue_ComplianceData> r0 = com.google.android.datatransport.cct.internal.AutoValue_ComplianceData.class
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.android.datatransport.cct.internal.ExternalPrivacyContext> r0 = com.google.android.datatransport.cct.internal.ExternalPrivacyContext.class
            com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$ExternalPrivacyContextEncoder r1 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ExternalPrivacyContextEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.android.datatransport.cct.internal.AutoValue_ExternalPrivacyContext> r0 = com.google.android.datatransport.cct.internal.AutoValue_ExternalPrivacyContext.class
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.android.datatransport.cct.internal.ExternalPRequestContext> r0 = com.google.android.datatransport.cct.internal.ExternalPRequestContext.class
            com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$ExternalPRequestContextEncoder r1 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ExternalPRequestContextEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.android.datatransport.cct.internal.AutoValue_ExternalPRequestContext> r0 = com.google.android.datatransport.cct.internal.AutoValue_ExternalPRequestContext.class
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.android.datatransport.cct.internal.NetworkConnectionInfo> r0 = com.google.android.datatransport.cct.internal.NetworkConnectionInfo.class
            com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$NetworkConnectionInfoEncoder r1 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.NetworkConnectionInfoEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.android.datatransport.cct.internal.AutoValue_NetworkConnectionInfo> r0 = com.google.android.datatransport.cct.internal.AutoValue_NetworkConnectionInfo.class
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.android.datatransport.cct.internal.ExperimentIds> r0 = com.google.android.datatransport.cct.internal.ExperimentIds.class
            com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$ExperimentIdsEncoder r1 = com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.ExperimentIdsEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.android.datatransport.cct.internal.AutoValue_ExperimentIds> r0 = com.google.android.datatransport.cct.internal.AutoValue_ExperimentIds.class
            r3.registerEncoder(r0, r1)
            return
    }
}
