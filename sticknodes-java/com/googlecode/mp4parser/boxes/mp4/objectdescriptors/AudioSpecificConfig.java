package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

@com.googlecode.mp4parser.boxes.mp4.objectdescriptors.Descriptor(objectTypeIndication = 64, tags = {5})
/* loaded from: classes2.dex */
public class AudioSpecificConfig extends com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor {
    public static java.util.Map<java.lang.Integer, java.lang.String> audioObjectTypeMap;
    public static java.util.Map<java.lang.Integer, java.lang.Integer> samplingFrequencyIndexMap;
    public boolean aacScalefactorDataResilienceFlag;
    public boolean aacSectionDataResilienceFlag;
    public boolean aacSpectralDataResilienceFlag;
    public int audioObjectType;
    public int channelConfiguration;
    byte[] configBytes;
    public int coreCoderDelay;
    public int dependsOnCoreCoder;
    public int directMapping;
    public com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.ELDSpecificConfig eldSpecificConfig;
    public int epConfig;
    public int erHvxcExtensionFlag;
    public int extensionAudioObjectType;
    public int extensionChannelConfiguration;
    public int extensionFlag;
    public int extensionFlag3;
    public int extensionSamplingFrequency;
    public int extensionSamplingFrequencyIndex;
    public int fillBits;
    public int frameLengthFlag;
    public boolean gaSpecificConfig;
    public int hilnContMode;
    public int hilnEnhaLayer;
    public int hilnEnhaQuantMode;
    public int hilnFrameLength;
    public int hilnMaxNumLine;
    public int hilnQuantMode;
    public int hilnSampleRateCode;
    public int hvxcRateMode;
    public int hvxcVarMode;
    public int innerSyncExtensionType;
    public int isBaseLayer;
    public int layerNr;
    public int layer_length;
    public int numOfSubFrame;
    public int origExtensionAudioObjectType;
    public int originalAudioObjectType;
    public int outerSyncExtensionType;
    public int paraExtensionFlag;
    public int paraMode;
    public boolean parametricSpecificConfig;
    boolean parsed;
    public boolean psPresentFlag;
    public int sacPayloadEmbedding;
    public int samplingFrequency;
    public int samplingFrequencyIndex;
    public boolean sbrPresentFlag;
    public int syncExtensionType;
    public int var_ScalableFlag;

    public class ELDSpecificConfig {
        private static final int ELDEXT_TERM = 0;
        public boolean aacScalefactorDataResilienceFlag;
        public boolean aacSectionDataResilienceFlag;
        public boolean aacSpectralDataResilienceFlag;
        public boolean frameLengthFlag;
        public boolean ldSbrCrcFlag;
        public boolean ldSbrPresentFlag;
        public boolean ldSbrSamplingRate;
        final /* synthetic */ com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig this$0;

        public ELDSpecificConfig(com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig r4, int r5, com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer r6) {
                r3 = this;
                r3.this$0 = r4
                r3.<init>()
                boolean r4 = r6.readBool()
                r3.frameLengthFlag = r4
                boolean r4 = r6.readBool()
                r3.aacSectionDataResilienceFlag = r4
                boolean r4 = r6.readBool()
                r3.aacScalefactorDataResilienceFlag = r4
                boolean r4 = r6.readBool()
                r3.aacSpectralDataResilienceFlag = r4
                boolean r4 = r6.readBool()
                r3.ldSbrPresentFlag = r4
                if (r4 == 0) goto L34
                boolean r4 = r6.readBool()
                r3.ldSbrSamplingRate = r4
                boolean r4 = r6.readBool()
                r3.ldSbrCrcFlag = r4
                r3.ld_sbr_header(r5, r6)
            L34:
                r4 = 4
                int r5 = r6.readBits(r4)
                if (r5 != 0) goto L3c
                return
            L3c:
                int r4 = r6.readBits(r4)
                r5 = 15
                r0 = 8
                r1 = 0
                if (r4 != r5) goto L4d
                int r5 = r6.readBits(r0)
                int r4 = r4 + r5
                goto L4e
            L4d:
                r5 = 0
            L4e:
                r2 = 255(0xff, float:3.57E-43)
                if (r5 != r2) goto L59
                r5 = 16
                int r5 = r6.readBits(r5)
                int r4 = r4 + r5
            L59:
                if (r1 < r4) goto L5c
                goto L34
            L5c:
                r6.readBits(r0)
                int r1 = r1 + 1
                goto L59
        }

        public void ld_sbr_header(int r4, com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer r5) {
                r3 = this;
                r0 = 0
                switch(r4) {
                    case 1: goto Lc;
                    case 2: goto Lc;
                    case 3: goto La;
                    case 4: goto L8;
                    case 5: goto L8;
                    case 6: goto L8;
                    case 7: goto L6;
                    default: goto L4;
                }
            L4:
                r4 = 0
                goto Ld
            L6:
                r4 = 4
                goto Ld
            L8:
                r4 = 3
                goto Ld
            La:
                r4 = 2
                goto Ld
            Lc:
                r4 = 1
            Ld:
                if (r0 < r4) goto L10
                return
            L10:
                com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig$sbr_header r1 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig$sbr_header
                com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig r2 = r3.this$0
                r1.<init>(r2, r5)
                int r0 = r0 + 1
                goto Ld
        }
    }

    public class sbr_header {
        public boolean bs_alter_scale;
        public boolean bs_amp_res;
        public int bs_freq_scale;
        public boolean bs_header_extra_1;
        public boolean bs_header_extra_2;
        public boolean bs_interpol_freq;
        public int bs_limiter_bands;
        public int bs_limiter_gains;
        public int bs_noise_bands;
        public int bs_reserved;
        public boolean bs_smoothing_mode;
        public int bs_start_freq;
        public int bs_stop_freq;
        public int bs_xover_band;
        final /* synthetic */ com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig this$0;

        public sbr_header(com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig r2, com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer r3) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                boolean r2 = r3.readBool()
                r1.bs_amp_res = r2
                r2 = 4
                int r0 = r3.readBits(r2)
                r1.bs_start_freq = r0
                int r2 = r3.readBits(r2)
                r1.bs_stop_freq = r2
                r2 = 3
                int r2 = r3.readBits(r2)
                r1.bs_xover_band = r2
                r2 = 2
                int r0 = r3.readBits(r2)
                r1.bs_reserved = r0
                boolean r0 = r3.readBool()
                r1.bs_header_extra_1 = r0
                boolean r0 = r3.readBool()
                r1.bs_header_extra_2 = r0
                boolean r0 = r1.bs_header_extra_1
                if (r0 == 0) goto L48
                int r0 = r3.readBits(r2)
                r1.bs_freq_scale = r0
                boolean r0 = r3.readBool()
                r1.bs_alter_scale = r0
                int r0 = r3.readBits(r2)
                r1.bs_noise_bands = r0
            L48:
                boolean r0 = r1.bs_header_extra_2
                if (r0 == 0) goto L5e
                int r0 = r3.readBits(r2)
                r1.bs_limiter_bands = r0
                int r2 = r3.readBits(r2)
                r1.bs_limiter_gains = r2
                boolean r2 = r3.readBool()
                r1.bs_interpol_freq = r2
            L5e:
                boolean r2 = r3.readBool()
                r1.bs_smoothing_mode = r2
                return
        }
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.samplingFrequencyIndexMap = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap = r0
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.samplingFrequencyIndexMap
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 96000(0x17700, float:1.34525E-40)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.samplingFrequencyIndexMap
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 88200(0x15888, float:1.23595E-40)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.samplingFrequencyIndexMap
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 64000(0xfa00, float:8.9683E-41)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r2, r3)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.samplingFrequencyIndexMap
            r3 = 3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 48000(0xbb80, float:6.7262E-41)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r3, r4)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.samplingFrequencyIndexMap
            r4 = 4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 44100(0xac44, float:6.1797E-41)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.put(r4, r5)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.samplingFrequencyIndexMap
            r5 = 5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 32000(0x7d00, float:4.4842E-41)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0.put(r5, r6)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.samplingFrequencyIndexMap
            r6 = 6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 24000(0x5dc0, float:3.3631E-41)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0.put(r6, r7)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.samplingFrequencyIndexMap
            r7 = 7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 22050(0x5622, float:3.0899E-41)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0.put(r7, r8)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.samplingFrequencyIndexMap
            r8 = 8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9 = 16000(0x3e80, float:2.2421E-41)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r0.put(r8, r9)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.samplingFrequencyIndexMap
            r9 = 9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10 = 12000(0x2ee0, float:1.6816E-41)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r0.put(r9, r10)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.samplingFrequencyIndexMap
            r10 = 10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11 = 11025(0x2b11, float:1.545E-41)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r0.put(r10, r11)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.samplingFrequencyIndexMap
            r11 = 11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12 = 8000(0x1f40, float:1.121E-41)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r0.put(r11, r12)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            java.lang.String r12 = "AAC main"
            r0.put(r1, r12)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            java.lang.String r1 = "AAC LC"
            r0.put(r2, r1)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            java.lang.String r1 = "AAC SSR"
            r0.put(r3, r1)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            java.lang.String r1 = "AAC LTP"
            r0.put(r4, r1)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            java.lang.String r1 = "SBR"
            r0.put(r5, r1)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            java.lang.String r1 = "AAC Scalable"
            r0.put(r6, r1)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            java.lang.String r1 = "TwinVQ"
            r0.put(r7, r1)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            java.lang.String r1 = "CELP"
            r0.put(r8, r1)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            java.lang.String r1 = "HVXC"
            r0.put(r9, r1)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            java.lang.String r1 = "(reserved)"
            r0.put(r10, r1)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            r0.put(r11, r1)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            r2 = 12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "TTSI"
            r0.put(r2, r3)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            r2 = 13
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "Main synthetic"
            r0.put(r2, r3)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            r2 = 14
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "Wavetable synthesis"
            r0.put(r2, r3)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            r2 = 15
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "General MIDI"
            r0.put(r2, r3)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            r2 = 16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "Algorithmic Synthesis and Audio FX"
            r0.put(r2, r3)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            r2 = 17
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "ER AAC LC"
            r0.put(r2, r3)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            r2 = 18
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r2, r1)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            r1 = 19
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ER AAC LTP"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            r1 = 20
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ER AAC Scalable"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            r1 = 21
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ER TwinVQ"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            r1 = 22
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ER BSAC"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            r1 = 23
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ER AAC LD"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            r1 = 24
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ER CELP"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            r1 = 25
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ER HVXC"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            r1 = 26
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ER HILN"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            r1 = 27
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ER Parametric"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            r1 = 28
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "SSC"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            r1 = 29
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "PS"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            r1 = 30
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "MPEG Surround"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            r1 = 31
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "(escape)"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            r1 = 32
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "Layer-1"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            r1 = 33
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "Layer-2"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            r1 = 34
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "Layer-3"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            r1 = 35
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "DST"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            r1 = 36
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ALS"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            r1 = 37
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "SLS"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            r1 = 38
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "SLS non-core"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            r1 = 39
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "ER AAC ELD"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            r1 = 40
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "SMR Simple"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            r1 = 41
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "SMR Main"
            r0.put(r1, r2)
            return
    }

    public AudioSpecificConfig() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.extensionSamplingFrequencyIndex = r0
            r1.syncExtensionType = r0
            r1.innerSyncExtensionType = r0
            r1.outerSyncExtensionType = r0
            r0 = 0
            r1.parsed = r0
            r0 = 5
            r1.tag = r0
            return
    }

    private int gaSpecificConfigSize() {
            r5 = this;
            int r0 = r5.dependsOnCoreCoder
            r1 = 1
            if (r0 != r1) goto L8
            r0 = 16
            goto L9
        L8:
            r0 = 2
        L9:
            int r0 = r0 + r1
            int r2 = r5.channelConfiguration
            if (r2 == 0) goto L46
            int r2 = r5.audioObjectType
            r3 = 6
            r4 = 20
            if (r2 == r3) goto L17
            if (r2 != r4) goto L19
        L17:
            int r0 = r0 + 3
        L19:
            int r3 = r5.extensionFlag
            if (r3 != r1) goto L45
            r3 = 22
            if (r2 != r3) goto L25
            int r0 = r0 + 5
            int r0 = r0 + 11
        L25:
            r3 = 17
            if (r2 == r3) goto L33
            r3 = 19
            if (r2 == r3) goto L33
            if (r2 == r4) goto L33
            r3 = 23
            if (r2 != r3) goto L37
        L33:
            int r0 = r0 + 1
            int r0 = r0 + r1
            int r0 = r0 + r1
        L37:
            int r0 = r0 + r1
            int r2 = r5.extensionFlag3
            if (r2 == r1) goto L3d
            goto L45
        L3d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Not implemented"
            r0.<init>(r1)
            throw r0
        L45:
            return r0
        L46:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "can't parse program_config_element yet"
            r0.<init>(r1)
            throw r0
    }

    private int getAudioObjectType(com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer r3) throws java.io.IOException {
            r2 = this;
            r0 = 5
            int r0 = r3.readBits(r0)
            r1 = 31
            if (r0 != r1) goto L10
            r0 = 6
            int r3 = r3.readBits(r0)
            int r0 = r3 + 32
        L10:
            return r0
    }

    private void parseErHvxcConfig(int r1, int r2, int r3, com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer r4) throws java.io.IOException {
            r0 = this;
            r1 = 1
            int r2 = r4.readBits(r1)
            r0.hvxcVarMode = r2
            r2 = 2
            int r2 = r4.readBits(r2)
            r0.hvxcRateMode = r2
            int r2 = r4.readBits(r1)
            r0.erHvxcExtensionFlag = r2
            if (r2 != r1) goto L1c
            int r1 = r4.readBits(r1)
            r0.var_ScalableFlag = r1
        L1c:
            return
    }

    private void parseGaSpecificConfig(int r2, int r3, int r4, com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer r5) throws java.io.IOException {
            r1 = this;
            r2 = 1
            int r0 = r5.readBits(r2)
            r1.frameLengthFlag = r0
            int r0 = r5.readBits(r2)
            r1.dependsOnCoreCoder = r0
            if (r0 != r2) goto L17
            r0 = 14
            int r0 = r5.readBits(r0)
            r1.coreCoderDelay = r0
        L17:
            int r0 = r5.readBits(r2)
            r1.extensionFlag = r0
            if (r3 == 0) goto L78
            r3 = 6
            r0 = 20
            if (r4 == r3) goto L26
            if (r4 != r0) goto L2d
        L26:
            r3 = 3
            int r3 = r5.readBits(r3)
            r1.layerNr = r3
        L2d:
            int r3 = r1.extensionFlag
            if (r3 != r2) goto L75
            r3 = 22
            if (r4 != r3) goto L44
            r3 = 5
            int r3 = r5.readBits(r3)
            r1.numOfSubFrame = r3
            r3 = 11
            int r3 = r5.readBits(r3)
            r1.layer_length = r3
        L44:
            r3 = 17
            if (r4 == r3) goto L52
            r3 = 19
            if (r4 == r3) goto L52
            if (r4 == r0) goto L52
            r3 = 23
            if (r4 != r3) goto L64
        L52:
            boolean r3 = r5.readBool()
            r1.aacSectionDataResilienceFlag = r3
            boolean r3 = r5.readBool()
            r1.aacScalefactorDataResilienceFlag = r3
            boolean r3 = r5.readBool()
            r1.aacSpectralDataResilienceFlag = r3
        L64:
            int r3 = r5.readBits(r2)
            r1.extensionFlag3 = r3
            if (r3 == r2) goto L6d
            goto L75
        L6d:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "not yet implemented"
            r2.<init>(r3)
            throw r2
        L75:
            r1.gaSpecificConfig = r2
            return
        L78:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r3 = "can't parse program_config_element yet"
            r2.<init>(r3)
            throw r2
    }

    private void parseHilnConfig(int r1, int r2, int r3, com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer r4) throws java.io.IOException {
            r0 = this;
            r1 = 1
            int r1 = r4.readBits(r1)
            r0.hilnQuantMode = r1
            r1 = 8
            int r1 = r4.readBits(r1)
            r0.hilnMaxNumLine = r1
            r1 = 4
            int r1 = r4.readBits(r1)
            r0.hilnSampleRateCode = r1
            r1 = 12
            int r1 = r4.readBits(r1)
            r0.hilnFrameLength = r1
            r1 = 2
            int r1 = r4.readBits(r1)
            r0.hilnContMode = r1
            return
    }

    private void parseHilnEnexConfig(int r1, int r2, int r3, com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer r4) throws java.io.IOException {
            r0 = this;
            r1 = 1
            int r2 = r4.readBits(r1)
            r0.hilnEnhaLayer = r2
            if (r2 != r1) goto L10
            r1 = 2
            int r1 = r4.readBits(r1)
            r0.hilnEnhaQuantMode = r1
        L10:
            return
    }

    private void parseParaConfig(int r3, int r4, int r5, com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer r6) throws java.io.IOException {
            r2 = this;
            r0 = 2
            int r0 = r6.readBits(r0)
            r2.paraMode = r0
            r1 = 1
            if (r0 == r1) goto Ld
            r2.parseErHvxcConfig(r3, r4, r5, r6)
        Ld:
            int r0 = r2.paraMode
            if (r0 == 0) goto L14
            r2.parseHilnConfig(r3, r4, r5, r6)
        L14:
            int r3 = r6.readBits(r1)
            r2.paraExtensionFlag = r3
            r2.parametricSpecificConfig = r1
            return
    }

    private void parseParametricSpecificConfig(int r3, int r4, int r5, com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer r6) throws java.io.IOException {
            r2 = this;
            r0 = 1
            int r1 = r6.readBits(r0)
            r2.isBaseLayer = r1
            if (r1 != r0) goto Ld
            r2.parseParaConfig(r3, r4, r5, r6)
            goto L10
        Ld:
            r2.parseHilnEnexConfig(r3, r4, r5, r6)
        L10:
            return
    }

    private java.nio.ByteBuffer serializeConfigBytes() {
            r10 = this;
            int r0 = r10.getContentSize()
            byte[] r0 = new byte[r0]
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer r1 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer
            r1.<init>(r0)
            int r2 = r10.originalAudioObjectType
            r10.writeAudioObjectType(r2, r1)
            int r2 = r10.samplingFrequencyIndex
            r3 = 4
            r1.writeBits(r2, r3)
            int r2 = r10.samplingFrequencyIndex
            r4 = 24
            r5 = 15
            if (r2 != r5) goto L27
            int r2 = r10.samplingFrequency
            r1.writeBits(r2, r4)
        L27:
            int r2 = r10.channelConfiguration
            r1.writeBits(r2, r3)
            int r2 = r10.audioObjectType
            r6 = 22
            r7 = 29
            r8 = 1
            r9 = 5
            if (r2 == r9) goto L38
            if (r2 != r7) goto L5c
        L38:
            r10.extensionAudioObjectType = r9
            r10.sbrPresentFlag = r8
            if (r2 != r7) goto L40
            r10.psPresentFlag = r8
        L40:
            int r2 = r10.extensionSamplingFrequencyIndex
            r1.writeBits(r2, r3)
            int r2 = r10.extensionSamplingFrequencyIndex
            if (r2 != r5) goto L4e
            int r2 = r10.extensionSamplingFrequency
            r1.writeBits(r2, r4)
        L4e:
            int r2 = r10.audioObjectType
            r10.writeAudioObjectType(r2, r1)
            int r2 = r10.audioObjectType
            if (r2 != r6) goto L5c
            int r2 = r10.extensionChannelConfiguration
            r1.writeBits(r2, r3)
        L5c:
            int r2 = r10.audioObjectType
            switch(r2) {
                case 1: goto Le5;
                case 2: goto Le5;
                case 3: goto Le5;
                case 4: goto Le5;
                case 5: goto L61;
                case 6: goto Le5;
                case 7: goto Le5;
                case 8: goto Ldd;
                case 9: goto Ld5;
                case 10: goto L61;
                case 11: goto L61;
                case 12: goto Lcd;
                case 13: goto Lc5;
                case 14: goto Lc5;
                case 15: goto Lc5;
                case 16: goto Lc5;
                case 17: goto Le5;
                case 18: goto L61;
                case 19: goto Le5;
                case 20: goto Le5;
                case 21: goto Le5;
                case 22: goto Le5;
                case 23: goto Le5;
                case 24: goto Lbd;
                case 25: goto Lb5;
                case 26: goto Lad;
                case 27: goto Lad;
                case 28: goto La5;
                case 29: goto L61;
                case 30: goto L98;
                case 31: goto L61;
                case 32: goto L90;
                case 33: goto L90;
                case 34: goto L90;
                case 35: goto L88;
                case 36: goto L7b;
                case 37: goto L73;
                case 38: goto L73;
                case 39: goto L6b;
                case 40: goto L63;
                case 41: goto L63;
                default: goto L61;
            }
        L61:
            goto Le8
        L63:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "can't parse SymbolicMusicSpecificConfig yet"
            r0.<init>(r1)
            throw r0
        L6b:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "can't write ELDSpecificConfig yet"
            r0.<init>(r1)
            throw r0
        L73:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "can't write SLSSpecificConfig yet"
            r0.<init>(r1)
            throw r0
        L7b:
            int r0 = r10.fillBits
            r1.writeBits(r0, r9)
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "can't write ALSSpecificConfig yet"
            r0.<init>(r1)
            throw r0
        L88:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "can't write DSTSpecificConfig yet"
            r0.<init>(r1)
            throw r0
        L90:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "can't write MPEG_1_2_SpecificConfig yet"
            r0.<init>(r1)
            throw r0
        L98:
            int r0 = r10.sacPayloadEmbedding
            r1.writeBits(r0, r8)
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "can't write SpatialSpecificConfig yet"
            r0.<init>(r1)
            throw r0
        La5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "can't write SSCSpecificConfig yet"
            r0.<init>(r1)
            throw r0
        Lad:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "can't write parseParametricSpecificConfig yet"
            r0.<init>(r1)
            throw r0
        Lb5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "can't write ErrorResilientHvxcSpecificConfig yet"
            r0.<init>(r1)
            throw r0
        Lbd:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "can't write ErrorResilientCelpSpecificConfig yet"
            r0.<init>(r1)
            throw r0
        Lc5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "can't write StructuredAudioSpecificConfig yet"
            r0.<init>(r1)
            throw r0
        Lcd:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "can't write TTSSpecificConfig yet"
            r0.<init>(r1)
            throw r0
        Ld5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "can't write HvxcSpecificConfig yet"
            r0.<init>(r1)
            throw r0
        Ldd:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "can't write CelpSpecificConfig yet"
            r0.<init>(r1)
            throw r0
        Le5:
            r10.writeGaSpecificConfig(r1)
        Le8:
            int r2 = r10.audioObjectType
            r7 = 17
            if (r2 == r7) goto Lf6
            r7 = 39
            if (r2 == r7) goto Lf6
            switch(r2) {
                case 19: goto Lf6;
                case 20: goto Lf6;
                case 21: goto Lf6;
                case 22: goto Lf6;
                case 23: goto Lf6;
                case 24: goto Lf6;
                case 25: goto Lf6;
                case 26: goto Lf6;
                case 27: goto Lf6;
                default: goto Lf5;
            }
        Lf5:
            goto L117
        Lf6:
            int r2 = r10.epConfig
            r7 = 2
            r1.writeBits(r2, r7)
            int r2 = r10.epConfig
            if (r2 == r7) goto L17f
            r7 = 3
            if (r2 == r7) goto L17f
            if (r2 != r7) goto L117
            int r2 = r10.directMapping
            r1.writeBits(r2, r8)
            int r2 = r10.directMapping
            if (r2 == 0) goto L10f
            goto L117
        L10f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "not implemented"
            r0.<init>(r1)
            throw r0
        L117:
            int r2 = r10.outerSyncExtensionType
            if (r2 < 0) goto L178
            r7 = 11
            r1.writeBits(r2, r7)
            int r2 = r10.outerSyncExtensionType
            r8 = 695(0x2b7, float:9.74E-43)
            if (r2 != r8) goto L178
            int r2 = r10.extensionAudioObjectType
            r10.writeAudioObjectType(r2, r1)
            int r2 = r10.extensionAudioObjectType
            if (r2 != r9) goto L158
            boolean r2 = r10.sbrPresentFlag
            r1.writeBool(r2)
            boolean r2 = r10.sbrPresentFlag
            if (r2 == 0) goto L158
            int r2 = r10.extensionSamplingFrequencyIndex
            r1.writeBits(r2, r3)
            int r2 = r10.extensionSamplingFrequencyIndex
            if (r2 != r5) goto L146
            int r2 = r10.extensionSamplingFrequency
            r1.writeBits(r2, r4)
        L146:
            int r2 = r10.innerSyncExtensionType
            if (r2 < 0) goto L158
            r1.writeBits(r2, r7)
            int r2 = r10.syncExtensionType
            r7 = 1352(0x548, float:1.895E-42)
            if (r2 != r7) goto L158
            boolean r2 = r10.psPresentFlag
            r1.writeBool(r2)
        L158:
            int r2 = r10.extensionAudioObjectType
            if (r2 != r6) goto L178
            boolean r2 = r10.sbrPresentFlag
            r1.writeBool(r2)
            boolean r2 = r10.sbrPresentFlag
            if (r2 == 0) goto L173
            int r2 = r10.extensionSamplingFrequencyIndex
            r1.writeBits(r2, r3)
            int r2 = r10.extensionSamplingFrequencyIndex
            if (r2 != r5) goto L173
            int r2 = r10.extensionSamplingFrequency
            r1.writeBits(r2, r4)
        L173:
            int r2 = r10.extensionChannelConfiguration
            r1.writeBits(r2, r3)
        L178:
            java.nio.Buffer r0 = r0.rewind()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            return r0
        L17f:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "can't parse ErrorProtectionSpecificConfig yet"
            r0.<init>(r1)
            throw r0
    }

    private void writeAudioObjectType(int r4, com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer r5) {
            r3 = this;
            r0 = 5
            r1 = 32
            if (r4 < r1) goto L10
            r2 = 31
            r5.writeBits(r2, r0)
            int r4 = r4 - r1
            r0 = 6
            r5.writeBits(r4, r0)
            goto L13
        L10:
            r5.writeBits(r4, r0)
        L13:
            return
    }

    private void writeGaSpecificConfig(com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer r5) {
            r4 = this;
            int r0 = r4.frameLengthFlag
            r1 = 1
            r5.writeBits(r0, r1)
            int r0 = r4.dependsOnCoreCoder
            r5.writeBits(r0, r1)
            int r0 = r4.dependsOnCoreCoder
            if (r0 != r1) goto L16
            int r0 = r4.coreCoderDelay
            r2 = 14
            r5.writeBits(r0, r2)
        L16:
            int r0 = r4.extensionFlag
            r5.writeBits(r0, r1)
            int r0 = r4.channelConfiguration
            if (r0 == 0) goto L77
            int r0 = r4.audioObjectType
            r2 = 6
            r3 = 20
            if (r0 == r2) goto L28
            if (r0 != r3) goto L2e
        L28:
            int r0 = r4.layerNr
            r2 = 3
            r5.writeBits(r0, r2)
        L2e:
            int r0 = r4.extensionFlag
            if (r0 != r1) goto L76
            int r0 = r4.audioObjectType
            r2 = 22
            if (r0 != r2) goto L45
            int r0 = r4.numOfSubFrame
            r2 = 5
            r5.writeBits(r0, r2)
            int r0 = r4.layer_length
            r2 = 11
            r5.writeBits(r0, r2)
        L45:
            int r0 = r4.audioObjectType
            r2 = 17
            if (r0 == r2) goto L55
            r2 = 19
            if (r0 == r2) goto L55
            if (r0 == r3) goto L55
            r2 = 23
            if (r0 != r2) goto L64
        L55:
            boolean r0 = r4.aacSectionDataResilienceFlag
            r5.writeBool(r0)
            boolean r0 = r4.aacScalefactorDataResilienceFlag
            r5.writeBool(r0)
            boolean r0 = r4.aacSpectralDataResilienceFlag
            r5.writeBool(r0)
        L64:
            int r0 = r4.extensionFlag3
            r5.writeBits(r0, r1)
            int r5 = r4.extensionFlag3
            if (r5 == r1) goto L6e
            goto L76
        L6e:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r0 = "not yet implemented"
            r5.<init>(r0)
            throw r5
        L76:
            return
        L77:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "can't parse program_config_element yet"
            r5.<init>(r0)
            throw r5
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L147
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L13
            goto L147
        L13:
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig r5 = (com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig) r5
            boolean r2 = r4.aacScalefactorDataResilienceFlag
            boolean r3 = r5.aacScalefactorDataResilienceFlag
            if (r2 == r3) goto L1c
            return r1
        L1c:
            boolean r2 = r4.aacSectionDataResilienceFlag
            boolean r3 = r5.aacSectionDataResilienceFlag
            if (r2 == r3) goto L23
            return r1
        L23:
            boolean r2 = r4.aacSpectralDataResilienceFlag
            boolean r3 = r5.aacSpectralDataResilienceFlag
            if (r2 == r3) goto L2a
            return r1
        L2a:
            int r2 = r4.audioObjectType
            int r3 = r5.audioObjectType
            if (r2 == r3) goto L31
            return r1
        L31:
            int r2 = r4.channelConfiguration
            int r3 = r5.channelConfiguration
            if (r2 == r3) goto L38
            return r1
        L38:
            int r2 = r4.coreCoderDelay
            int r3 = r5.coreCoderDelay
            if (r2 == r3) goto L3f
            return r1
        L3f:
            int r2 = r4.dependsOnCoreCoder
            int r3 = r5.dependsOnCoreCoder
            if (r2 == r3) goto L46
            return r1
        L46:
            int r2 = r4.directMapping
            int r3 = r5.directMapping
            if (r2 == r3) goto L4d
            return r1
        L4d:
            int r2 = r4.epConfig
            int r3 = r5.epConfig
            if (r2 == r3) goto L54
            return r1
        L54:
            int r2 = r4.erHvxcExtensionFlag
            int r3 = r5.erHvxcExtensionFlag
            if (r2 == r3) goto L5b
            return r1
        L5b:
            int r2 = r4.extensionAudioObjectType
            int r3 = r5.extensionAudioObjectType
            if (r2 == r3) goto L62
            return r1
        L62:
            int r2 = r4.extensionChannelConfiguration
            int r3 = r5.extensionChannelConfiguration
            if (r2 == r3) goto L69
            return r1
        L69:
            int r2 = r4.extensionFlag
            int r3 = r5.extensionFlag
            if (r2 == r3) goto L70
            return r1
        L70:
            int r2 = r4.extensionFlag3
            int r3 = r5.extensionFlag3
            if (r2 == r3) goto L77
            return r1
        L77:
            int r2 = r4.extensionSamplingFrequency
            int r3 = r5.extensionSamplingFrequency
            if (r2 == r3) goto L7e
            return r1
        L7e:
            int r2 = r4.extensionSamplingFrequencyIndex
            int r3 = r5.extensionSamplingFrequencyIndex
            if (r2 == r3) goto L85
            return r1
        L85:
            int r2 = r4.fillBits
            int r3 = r5.fillBits
            if (r2 == r3) goto L8c
            return r1
        L8c:
            int r2 = r4.frameLengthFlag
            int r3 = r5.frameLengthFlag
            if (r2 == r3) goto L93
            return r1
        L93:
            boolean r2 = r4.gaSpecificConfig
            boolean r3 = r5.gaSpecificConfig
            if (r2 == r3) goto L9a
            return r1
        L9a:
            int r2 = r4.hilnContMode
            int r3 = r5.hilnContMode
            if (r2 == r3) goto La1
            return r1
        La1:
            int r2 = r4.hilnEnhaLayer
            int r3 = r5.hilnEnhaLayer
            if (r2 == r3) goto La8
            return r1
        La8:
            int r2 = r4.hilnEnhaQuantMode
            int r3 = r5.hilnEnhaQuantMode
            if (r2 == r3) goto Laf
            return r1
        Laf:
            int r2 = r4.hilnFrameLength
            int r3 = r5.hilnFrameLength
            if (r2 == r3) goto Lb6
            return r1
        Lb6:
            int r2 = r4.hilnMaxNumLine
            int r3 = r5.hilnMaxNumLine
            if (r2 == r3) goto Lbd
            return r1
        Lbd:
            int r2 = r4.hilnQuantMode
            int r3 = r5.hilnQuantMode
            if (r2 == r3) goto Lc4
            return r1
        Lc4:
            int r2 = r4.hilnSampleRateCode
            int r3 = r5.hilnSampleRateCode
            if (r2 == r3) goto Lcb
            return r1
        Lcb:
            int r2 = r4.hvxcRateMode
            int r3 = r5.hvxcRateMode
            if (r2 == r3) goto Ld2
            return r1
        Ld2:
            int r2 = r4.hvxcVarMode
            int r3 = r5.hvxcVarMode
            if (r2 == r3) goto Ld9
            return r1
        Ld9:
            int r2 = r4.isBaseLayer
            int r3 = r5.isBaseLayer
            if (r2 == r3) goto Le0
            return r1
        Le0:
            int r2 = r4.layerNr
            int r3 = r5.layerNr
            if (r2 == r3) goto Le7
            return r1
        Le7:
            int r2 = r4.layer_length
            int r3 = r5.layer_length
            if (r2 == r3) goto Lee
            return r1
        Lee:
            int r2 = r4.numOfSubFrame
            int r3 = r5.numOfSubFrame
            if (r2 == r3) goto Lf5
            return r1
        Lf5:
            int r2 = r4.paraExtensionFlag
            int r3 = r5.paraExtensionFlag
            if (r2 == r3) goto Lfc
            return r1
        Lfc:
            int r2 = r4.paraMode
            int r3 = r5.paraMode
            if (r2 == r3) goto L103
            return r1
        L103:
            boolean r2 = r4.parametricSpecificConfig
            boolean r3 = r5.parametricSpecificConfig
            if (r2 == r3) goto L10a
            return r1
        L10a:
            boolean r2 = r4.psPresentFlag
            boolean r3 = r5.psPresentFlag
            if (r2 == r3) goto L111
            return r1
        L111:
            int r2 = r4.sacPayloadEmbedding
            int r3 = r5.sacPayloadEmbedding
            if (r2 == r3) goto L118
            return r1
        L118:
            int r2 = r4.samplingFrequency
            int r3 = r5.samplingFrequency
            if (r2 == r3) goto L11f
            return r1
        L11f:
            int r2 = r4.samplingFrequencyIndex
            int r3 = r5.samplingFrequencyIndex
            if (r2 == r3) goto L126
            return r1
        L126:
            boolean r2 = r4.sbrPresentFlag
            boolean r3 = r5.sbrPresentFlag
            if (r2 == r3) goto L12d
            return r1
        L12d:
            int r2 = r4.syncExtensionType
            int r3 = r5.syncExtensionType
            if (r2 == r3) goto L134
            return r1
        L134:
            int r2 = r4.var_ScalableFlag
            int r3 = r5.var_ScalableFlag
            if (r2 == r3) goto L13b
            return r1
        L13b:
            byte[] r2 = r4.configBytes
            byte[] r5 = r5.configBytes
            boolean r5 = java.util.Arrays.equals(r2, r5)
            if (r5 != 0) goto L146
            return r1
        L146:
            return r0
        L147:
            return r1
    }

    public int getAudioObjectType() {
            r1 = this;
            int r0 = r1.audioObjectType
            return r0
    }

    public int getChannelConfiguration() {
            r1 = this;
            int r0 = r1.channelConfiguration
            return r0
    }

    public byte[] getConfigBytes() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.serializeConfigBytes()
            byte[] r0 = r0.array()
            return r0
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    int getContentSize() {
            r7 = this;
            int r0 = r7.originalAudioObjectType
            r1 = 30
            r2 = 5
            if (r0 <= r1) goto La
            r0 = 11
            goto Lb
        La:
            r0 = 5
        Lb:
            int r0 = r0 + 4
            int r3 = r7.samplingFrequencyIndex
            r4 = 15
            if (r3 != r4) goto L15
            int r0 = r0 + 24
        L15:
            int r0 = r0 + 4
            int r3 = r7.audioObjectType
            if (r3 == r2) goto L1f
            r5 = 29
            if (r3 != r5) goto L27
        L1f:
            int r0 = r0 + 4
            int r5 = r7.extensionSamplingFrequencyIndex
            if (r5 != r4) goto L27
            int r0 = r0 + 24
        L27:
            r5 = 22
            if (r3 != r5) goto L2d
            int r0 = r0 + 4
        L2d:
            boolean r3 = r7.gaSpecificConfig
            if (r3 == 0) goto L36
            int r3 = r7.gaSpecificConfigSize()
            int r0 = r0 + r3
        L36:
            int r3 = r7.outerSyncExtensionType
            if (r3 < 0) goto L76
            int r0 = r0 + 11
            r6 = 695(0x2b7, float:9.74E-43)
            if (r3 != r6) goto L76
            int r0 = r0 + 5
            int r3 = r7.extensionAudioObjectType
            if (r3 <= r1) goto L48
            int r0 = r0 + 6
        L48:
            if (r3 != r2) goto L64
            int r0 = r0 + 1
            boolean r1 = r7.sbrPresentFlag
            if (r1 == 0) goto L64
            int r0 = r0 + 4
            int r1 = r7.extensionSamplingFrequencyIndex
            if (r1 != r4) goto L58
            int r0 = r0 + 24
        L58:
            int r1 = r7.innerSyncExtensionType
            if (r1 < 0) goto L64
            int r0 = r0 + 11
            r2 = 1352(0x548, float:1.895E-42)
            if (r1 != r2) goto L64
            int r0 = r0 + 1
        L64:
            if (r3 != r5) goto L76
            int r0 = r0 + 1
            boolean r1 = r7.sbrPresentFlag
            if (r1 == 0) goto L74
            int r0 = r0 + 4
            int r1 = r7.extensionSamplingFrequencyIndex
            if (r1 != r4) goto L74
            int r0 = r0 + 24
        L74:
            int r0 = r0 + 4
        L76:
            double r0 = (double) r0
            r2 = 4620693217682128896(0x4020000000000000, double:8.0)
            double r0 = r0 / r2
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            return r0
    }

    public int getExtensionAudioObjectType() {
            r1 = this;
            int r0 = r1.extensionAudioObjectType
            return r0
    }

    public int getExtensionSamplingFrequency() {
            r2 = this;
            int r0 = r2.extensionSamplingFrequencyIndex
            r1 = 15
            if (r0 != r1) goto L9
            int r0 = r2.extensionSamplingFrequency
            goto L19
        L9:
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.samplingFrequencyIndexMap
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
        L19:
            return r0
    }

    public int getSamplingFrequency() {
            r2 = this;
            int r0 = r2.samplingFrequencyIndex
            r1 = 15
            if (r0 != r1) goto L9
            int r0 = r2.samplingFrequency
            goto L19
        L9:
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.samplingFrequencyIndexMap
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
        L19:
            return r0
    }

    public int hashCode() {
            r2 = this;
            byte[] r0 = r2.configBytes
            if (r0 == 0) goto L9
            int r0 = java.util.Arrays.hashCode(r0)
            goto La
        L9:
            r0 = 0
        La:
            int r0 = r0 * 31
            int r1 = r2.audioObjectType
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.samplingFrequencyIndex
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.samplingFrequency
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.channelConfiguration
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.extensionAudioObjectType
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r2.sbrPresentFlag
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r2.psPresentFlag
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.extensionSamplingFrequencyIndex
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.extensionSamplingFrequency
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.extensionChannelConfiguration
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.sacPayloadEmbedding
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.fillBits
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.epConfig
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.directMapping
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.syncExtensionType
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.frameLengthFlag
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.dependsOnCoreCoder
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.coreCoderDelay
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.extensionFlag
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.layerNr
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.numOfSubFrame
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.layer_length
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r2.aacSectionDataResilienceFlag
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r2.aacScalefactorDataResilienceFlag
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r2.aacSpectralDataResilienceFlag
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.extensionFlag3
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r2.gaSpecificConfig
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.isBaseLayer
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.paraMode
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.paraExtensionFlag
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.hvxcVarMode
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.hvxcRateMode
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.erHvxcExtensionFlag
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.var_ScalableFlag
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.hilnQuantMode
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.hilnMaxNumLine
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.hilnSampleRateCode
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.hilnFrameLength
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.hilnContMode
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.hilnEnhaLayer
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.hilnEnhaQuantMode
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r2.parametricSpecificConfig
            int r0 = r0 + r1
            return r0
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public void parseDetail(java.nio.ByteBuffer r10) throws java.io.IOException {
            r9 = this;
            r0 = 1
            r9.parsed = r0
            java.nio.ByteBuffer r1 = r10.slice()
            int r2 = r9.sizeOfInstance
            r1.limit(r2)
            int r2 = r10.position()
            int r3 = r9.sizeOfInstance
            int r2 = r2 + r3
            r10.position(r2)
            int r10 = r9.sizeOfInstance
            byte[] r10 = new byte[r10]
            r9.configBytes = r10
            r1.get(r10)
            r1.rewind()
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer r10 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer
            r10.<init>(r1)
            int r1 = r9.getAudioObjectType(r10)
            r9.audioObjectType = r1
            r9.originalAudioObjectType = r1
            r1 = 4
            int r2 = r10.readBits(r1)
            r9.samplingFrequencyIndex = r2
            r3 = 24
            r4 = 15
            if (r2 != r4) goto L42
            int r2 = r10.readBits(r3)
            r9.samplingFrequency = r2
        L42:
            int r2 = r10.readBits(r1)
            r9.channelConfiguration = r2
            int r2 = r9.audioObjectType
            r5 = 22
            r6 = 29
            r7 = 5
            if (r2 == r7) goto L58
            if (r2 != r6) goto L54
            goto L58
        L54:
            r2 = 0
            r9.extensionAudioObjectType = r2
            goto L7c
        L58:
            r9.extensionAudioObjectType = r7
            r9.sbrPresentFlag = r0
            if (r2 != r6) goto L60
            r9.psPresentFlag = r0
        L60:
            int r2 = r10.readBits(r1)
            r9.extensionSamplingFrequencyIndex = r2
            if (r2 != r4) goto L6e
            int r2 = r10.readBits(r3)
            r9.extensionSamplingFrequency = r2
        L6e:
            int r2 = r9.getAudioObjectType(r10)
            r9.audioObjectType = r2
            if (r2 != r5) goto L7c
            int r2 = r10.readBits(r1)
            r9.extensionChannelConfiguration = r2
        L7c:
            int r2 = r9.audioObjectType
            switch(r2) {
                case 1: goto L10a;
                case 2: goto L10a;
                case 3: goto L10a;
                case 4: goto L10a;
                case 5: goto L81;
                case 6: goto L10a;
                case 7: goto L10a;
                case 8: goto L102;
                case 9: goto Lfa;
                case 10: goto L81;
                case 11: goto L81;
                case 12: goto Lf2;
                case 13: goto Lea;
                case 14: goto Lea;
                case 15: goto Lea;
                case 16: goto Lea;
                case 17: goto L10a;
                case 18: goto L81;
                case 19: goto L10a;
                case 20: goto L10a;
                case 21: goto L10a;
                case 22: goto L10a;
                case 23: goto L10a;
                case 24: goto Le2;
                case 25: goto Lda;
                case 26: goto Ld2;
                case 27: goto Ld2;
                case 28: goto Lca;
                case 29: goto L81;
                case 30: goto Lbc;
                case 31: goto L81;
                case 32: goto Lb4;
                case 33: goto Lb4;
                case 34: goto Lb4;
                case 35: goto Lac;
                case 36: goto L9e;
                case 37: goto L96;
                case 38: goto L96;
                case 39: goto L8b;
                case 40: goto L83;
                case 41: goto L83;
                default: goto L81;
            }
        L81:
            goto L111
        L83:
            java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "can't parse SymbolicMusicSpecificConfig yet"
            r10.<init>(r0)
            throw r10
        L8b:
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig$ELDSpecificConfig r2 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig$ELDSpecificConfig
            int r6 = r9.channelConfiguration
            r2.<init>(r9, r6, r10)
            r9.eldSpecificConfig = r2
            goto L111
        L96:
            java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "can't parse SLSSpecificConfig yet"
            r10.<init>(r0)
            throw r10
        L9e:
            int r10 = r10.readBits(r7)
            r9.fillBits = r10
            java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "can't parse ALSSpecificConfig yet"
            r10.<init>(r0)
            throw r10
        Lac:
            java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "can't parse DSTSpecificConfig yet"
            r10.<init>(r0)
            throw r10
        Lb4:
            java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "can't parse MPEG_1_2_SpecificConfig yet"
            r10.<init>(r0)
            throw r10
        Lbc:
            int r10 = r10.readBits(r0)
            r9.sacPayloadEmbedding = r10
            java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "can't parse SpatialSpecificConfig yet"
            r10.<init>(r0)
            throw r10
        Lca:
            java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "can't parse SSCSpecificConfig yet"
            r10.<init>(r0)
            throw r10
        Ld2:
            int r6 = r9.samplingFrequencyIndex
            int r8 = r9.channelConfiguration
            r9.parseParametricSpecificConfig(r6, r8, r2, r10)
            goto L111
        Lda:
            java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "can't parse ErrorResilientHvxcSpecificConfig yet"
            r10.<init>(r0)
            throw r10
        Le2:
            java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "can't parse ErrorResilientCelpSpecificConfig yet"
            r10.<init>(r0)
            throw r10
        Lea:
            java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "can't parse StructuredAudioSpecificConfig yet"
            r10.<init>(r0)
            throw r10
        Lf2:
            java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "can't parse TTSSpecificConfig yet"
            r10.<init>(r0)
            throw r10
        Lfa:
            java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "can't parse HvxcSpecificConfig yet"
            r10.<init>(r0)
            throw r10
        L102:
            java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "can't parse CelpSpecificConfig yet"
            r10.<init>(r0)
            throw r10
        L10a:
            int r6 = r9.samplingFrequencyIndex
            int r8 = r9.channelConfiguration
            r9.parseGaSpecificConfig(r6, r8, r2, r10)
        L111:
            int r2 = r9.audioObjectType
            r6 = 17
            if (r2 == r6) goto L11f
            r6 = 39
            if (r2 == r6) goto L11f
            switch(r2) {
                case 19: goto L11f;
                case 20: goto L11f;
                case 21: goto L11f;
                case 22: goto L11f;
                case 23: goto L11f;
                case 24: goto L11f;
                case 25: goto L11f;
                case 26: goto L11f;
                case 27: goto L11f;
                default: goto L11e;
            }
        L11e:
            goto L13e
        L11f:
            r2 = 2
            int r6 = r10.readBits(r2)
            r9.epConfig = r6
            if (r6 == r2) goto L1b1
            r2 = 3
            if (r6 == r2) goto L1b1
            if (r6 != r2) goto L13e
            int r0 = r10.readBits(r0)
            r9.directMapping = r0
            if (r0 == 0) goto L136
            goto L13e
        L136:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            java.lang.String r0 = "not implemented"
            r10.<init>(r0)
            throw r10
        L13e:
            int r0 = r9.extensionAudioObjectType
            if (r0 == r7) goto L1b0
            int r0 = r10.remainingBits()
            r2 = 16
            if (r0 < r2) goto L1b0
            r0 = 11
            int r2 = r10.readBits(r0)
            r9.syncExtensionType = r2
            r9.outerSyncExtensionType = r2
            r6 = 695(0x2b7, float:9.74E-43)
            if (r2 != r6) goto L1b0
            int r2 = r9.getAudioObjectType(r10)
            r9.extensionAudioObjectType = r2
            if (r2 != r7) goto L190
            boolean r2 = r10.readBool()
            r9.sbrPresentFlag = r2
            if (r2 == 0) goto L190
            int r2 = r10.readBits(r1)
            r9.extensionSamplingFrequencyIndex = r2
            if (r2 != r4) goto L176
            int r2 = r10.readBits(r3)
            r9.extensionSamplingFrequency = r2
        L176:
            int r2 = r10.remainingBits()
            r6 = 12
            if (r2 < r6) goto L190
            int r0 = r10.readBits(r0)
            r9.syncExtensionType = r0
            r9.innerSyncExtensionType = r0
            r2 = 1352(0x548, float:1.895E-42)
            if (r0 != r2) goto L190
            boolean r0 = r10.readBool()
            r9.psPresentFlag = r0
        L190:
            int r0 = r9.extensionAudioObjectType
            if (r0 != r5) goto L1b0
            boolean r0 = r10.readBool()
            r9.sbrPresentFlag = r0
            if (r0 == 0) goto L1aa
            int r0 = r10.readBits(r1)
            r9.extensionSamplingFrequencyIndex = r0
            if (r0 != r4) goto L1aa
            int r0 = r10.readBits(r3)
            r9.extensionSamplingFrequency = r0
        L1aa:
            int r10 = r10.readBits(r1)
            r9.extensionChannelConfiguration = r10
        L1b0:
            return
        L1b1:
            java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "can't parse ErrorProtectionSpecificConfig yet"
            r10.<init>(r0)
            throw r10
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public java.nio.ByteBuffer serialize() {
            r2 = this;
            int r0 = r2.getSize()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            int r1 = r2.tag
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r0, r1)
            int r1 = r2.getContentSize()
            r2.writeSize(r0, r1)
            java.nio.ByteBuffer r1 = r2.serializeConfigBytes()
            r0.put(r1)
            java.nio.Buffer r0 = r0.rewind()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            return r0
    }

    public void setAudioObjectType(int r1) {
            r0 = this;
            r0.audioObjectType = r1
            return
    }

    public void setChannelConfiguration(int r1) {
            r0 = this;
            r0.channelConfiguration = r1
            return
    }

    public void setOriginalAudioObjectType(int r1) {
            r0 = this;
            r0.originalAudioObjectType = r1
            return
    }

    public void setSamplingFrequency(int r1) {
            r0 = this;
            r0.samplingFrequency = r1
            return
    }

    public void setSamplingFrequencyIndex(int r1) {
            r0 = this;
            r0.samplingFrequencyIndex = r1
            return
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AudioSpecificConfig"
            r0.append(r1)
            java.lang.String r1 = "{configBytes="
            r0.append(r1)
            byte[] r1 = r5.configBytes
            java.lang.String r1 = com.coremedia.iso.Hex.encodeHex(r1)
            r0.append(r1)
            java.lang.String r1 = ", audioObjectType="
            r0.append(r1)
            int r1 = r5.audioObjectType
            r0.append(r1)
            java.lang.String r1 = " ("
            r0.append(r1)
            java.util.Map<java.lang.Integer, java.lang.String> r2 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            int r3 = r5.audioObjectType
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r3 = ", samplingFrequencyIndex="
            r0.append(r3)
            int r3 = r5.samplingFrequencyIndex
            r0.append(r3)
            r0.append(r1)
            java.util.Map<java.lang.Integer, java.lang.Integer> r3 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.samplingFrequencyIndexMap
            int r4 = r5.samplingFrequencyIndex
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r3 = r3.get(r4)
            r0.append(r3)
            r0.append(r2)
            java.lang.String r3 = ", samplingFrequency="
            r0.append(r3)
            int r3 = r5.samplingFrequency
            r0.append(r3)
            java.lang.String r3 = ", channelConfiguration="
            r0.append(r3)
            int r3 = r5.channelConfiguration
            r0.append(r3)
            int r3 = r5.extensionAudioObjectType
            if (r3 <= 0) goto Ldc
            java.lang.String r3 = ", extensionAudioObjectType="
            r0.append(r3)
            int r3 = r5.extensionAudioObjectType
            r0.append(r3)
            r0.append(r1)
            java.util.Map<java.lang.Integer, java.lang.String> r3 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.audioObjectTypeMap
            int r4 = r5.extensionAudioObjectType
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            r0.append(r3)
            r0.append(r2)
            java.lang.String r3 = ", sbrPresentFlag="
            r0.append(r3)
            boolean r3 = r5.sbrPresentFlag
            r0.append(r3)
            java.lang.String r3 = ", psPresentFlag="
            r0.append(r3)
            boolean r3 = r5.psPresentFlag
            r0.append(r3)
            java.lang.String r3 = ", extensionSamplingFrequencyIndex="
            r0.append(r3)
            int r3 = r5.extensionSamplingFrequencyIndex
            r0.append(r3)
            r0.append(r1)
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.samplingFrequencyIndexMap
            int r3 = r5.extensionSamplingFrequencyIndex
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r1 = r1.get(r3)
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ", extensionSamplingFrequency="
            r0.append(r1)
            int r1 = r5.extensionSamplingFrequency
            r0.append(r1)
            java.lang.String r1 = ", extensionChannelConfiguration="
            r0.append(r1)
            int r1 = r5.extensionChannelConfiguration
            r0.append(r1)
        Ldc:
            java.lang.String r1 = ", syncExtensionType="
            r0.append(r1)
            int r1 = r5.syncExtensionType
            r0.append(r1)
            boolean r1 = r5.gaSpecificConfig
            if (r1 == 0) goto L158
            java.lang.String r1 = ", frameLengthFlag="
            r0.append(r1)
            int r1 = r5.frameLengthFlag
            r0.append(r1)
            java.lang.String r1 = ", dependsOnCoreCoder="
            r0.append(r1)
            int r1 = r5.dependsOnCoreCoder
            r0.append(r1)
            java.lang.String r1 = ", coreCoderDelay="
            r0.append(r1)
            int r1 = r5.coreCoderDelay
            r0.append(r1)
            java.lang.String r1 = ", extensionFlag="
            r0.append(r1)
            int r1 = r5.extensionFlag
            r0.append(r1)
            java.lang.String r1 = ", layerNr="
            r0.append(r1)
            int r1 = r5.layerNr
            r0.append(r1)
            java.lang.String r1 = ", numOfSubFrame="
            r0.append(r1)
            int r1 = r5.numOfSubFrame
            r0.append(r1)
            java.lang.String r1 = ", layer_length="
            r0.append(r1)
            int r1 = r5.layer_length
            r0.append(r1)
            java.lang.String r1 = ", aacSectionDataResilienceFlag="
            r0.append(r1)
            boolean r1 = r5.aacSectionDataResilienceFlag
            r0.append(r1)
            java.lang.String r1 = ", aacScalefactorDataResilienceFlag="
            r0.append(r1)
            boolean r1 = r5.aacScalefactorDataResilienceFlag
            r0.append(r1)
            java.lang.String r1 = ", aacSpectralDataResilienceFlag="
            r0.append(r1)
            boolean r1 = r5.aacSpectralDataResilienceFlag
            r0.append(r1)
            java.lang.String r1 = ", extensionFlag3="
            r0.append(r1)
            int r1 = r5.extensionFlag3
            r0.append(r1)
        L158:
            boolean r1 = r5.parametricSpecificConfig
            if (r1 == 0) goto L1e8
            java.lang.String r1 = ", isBaseLayer="
            r0.append(r1)
            int r1 = r5.isBaseLayer
            r0.append(r1)
            java.lang.String r1 = ", paraMode="
            r0.append(r1)
            int r1 = r5.paraMode
            r0.append(r1)
            java.lang.String r1 = ", paraExtensionFlag="
            r0.append(r1)
            int r1 = r5.paraExtensionFlag
            r0.append(r1)
            java.lang.String r1 = ", hvxcVarMode="
            r0.append(r1)
            int r1 = r5.hvxcVarMode
            r0.append(r1)
            java.lang.String r1 = ", hvxcRateMode="
            r0.append(r1)
            int r1 = r5.hvxcRateMode
            r0.append(r1)
            java.lang.String r1 = ", erHvxcExtensionFlag="
            r0.append(r1)
            int r1 = r5.erHvxcExtensionFlag
            r0.append(r1)
            java.lang.String r1 = ", var_ScalableFlag="
            r0.append(r1)
            int r1 = r5.var_ScalableFlag
            r0.append(r1)
            java.lang.String r1 = ", hilnQuantMode="
            r0.append(r1)
            int r1 = r5.hilnQuantMode
            r0.append(r1)
            java.lang.String r1 = ", hilnMaxNumLine="
            r0.append(r1)
            int r1 = r5.hilnMaxNumLine
            r0.append(r1)
            java.lang.String r1 = ", hilnSampleRateCode="
            r0.append(r1)
            int r1 = r5.hilnSampleRateCode
            r0.append(r1)
            java.lang.String r1 = ", hilnFrameLength="
            r0.append(r1)
            int r1 = r5.hilnFrameLength
            r0.append(r1)
            java.lang.String r1 = ", hilnContMode="
            r0.append(r1)
            int r1 = r5.hilnContMode
            r0.append(r1)
            java.lang.String r1 = ", hilnEnhaLayer="
            r0.append(r1)
            int r1 = r5.hilnEnhaLayer
            r0.append(r1)
            java.lang.String r1 = ", hilnEnhaQuantMode="
            r0.append(r1)
            int r1 = r5.hilnEnhaQuantMode
            r0.append(r1)
        L1e8:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
