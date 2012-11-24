/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.ac.picb.popgenomics.ui;

/**
 *
 * @author young
 */
public class HelpForm extends javax.swing.JFrame {

    /**
     * Creates new form HelpForm
     */
    public HelpForm(MainFrame main) {
        initComponents();
        this.setLocationRelativeTo(main);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTree2 = new javax.swing.JTree();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jEditorPane2 = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Help");
        setPreferredSize(new java.awt.Dimension(1280, 800));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Help Contents");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("READS DIVIDING");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Commands");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Options");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("BWA");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Commands");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Options");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("SAMTOOLS");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Commands");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Options");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("BCFTOOLS");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Commands");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Options");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("GATK");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Commands");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Options");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jTree2.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane3.setViewportView(jTree2);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane3)
                .addGap(0, 0, 0))
        );

        jEditorPane2.setEditable(false);
        jEditorPane2.setText("Help Contents\n==============================================================\nREADS DIVIDING\n\nOPTIONS\n\n-f \tFastq file to be divided\n-n\tThe number to be divided\n-o \tThe Target directory to store the dividing result\n\n==============================================================\nBWA\n\nCOMMANDS AND OPTIONS\n\nindex\t bwa index [-p prefix] [-a algoType] [-c] <in.db.fasta>\nIndex database sequences in the FASTA format.\n\nOPTIONS:\n-c\t Build color-space index. The input fast should be in nucleotide space.\n-p STR\t Prefix of the output database [same as db filename]\n-a STR\t Algorithm for constructing BWT index. Available options are:\nis\t IS linear-time algorithm for constructing suffix array. It requires 5.37N memory where N is the size of the database. IS is moderately fast, but does not work with database larger than 2GB. IS is the default algorithm due to its simplicity. The current codes for IS algorithm are reimplemented by Yuta Mori.\nbwtsw\t Algorithm implemented in BWT-SW. This method works with the whole human genome, but it does not work with database smaller than 10MB and it is usually slower than IS.\n\naln\t bwa aln [-n maxDiff] [-o maxGapO] [-e maxGapE] [-d nDelTail] [-i nIndelEnd] [-k maxSeedDiff] [-l seedLen] [-t nThrds] [-cRN] [-M misMsc] [-O gapOsc] [-E gapEsc] [-q trimQual] <in.db.fasta> <in.query.fq> > <out.sai>\nFind the SA coordinates of the input reads. Maximum maxSeedDiff differences are allowed in the first seedLen subsequence and maximum maxDiff differences are allowed in the whole sequence.\n\nOPTIONS:\n-n NUM\t Maximum edit distance if the value is INT, or the fraction of missing alignments given 2% uniform base error rate if FLOAT. In the latter case, the maximum edit distance is automatically chosen for different read lengths. [0.04]\n-o INT\t Maximum number of gap opens [1]\n-e INT\t Maximum number of gap extensions, -1 for k-difference mode (disallowing long gaps) [-1]\n-d INT\t Disallow a long deletion within INT bp towards the 3’-end [16]\n-i INT\t Disallow an indel within INT bp towards the ends [5]\n-l INT\t Take the first INT subsequence as seed. If INT is larger than the query sequence, seeding will be disabled. For long reads, this option is typically ranged from 25 to 35 for ‘-k 2’. [inf]\n-k INT\t Maximum edit distance in the seed [2]\n-t INT\t Number of threads (multi-threading mode) [1]\n-M INT\t Mismatch penalty. BWA will not search for suboptimal hits with a score lower than (bestScore-misMsc). [3]\n-O INT\t Gap open penalty [11]\n-E INT\t Gap extension penalty [4]\n-R INT\t Proceed with suboptimal alignments if there are no more than INT equally best hits. This option only affects paired-end mapping. Increasing this threshold helps to improve the pairing accuracy at the cost of speed, especially for short reads (~32bp).\n-c\t Reverse query but not complement it, which is required for alignment in the color space.\n-N\t Disable iterative search. All hits with no more than maxDiff differences will be found. This mode is much slower than the default.\n-q INT\t Parameter for read trimming. BWA trims a read down to argmax_x{\\sum_{i=x+1}^l(INT-q_i)} if q_l<INT where l is the original read length. [0]\n-I\t The input is in the Illumina 1.3+ read format (quality equals ASCII-64).\n-B INT\t Length of barcode starting from the 5’-end. When INT is positive, the barcode of each read will be trimmed before mapping and will be written at the BC SAM tag. For paired-end reads, the barcode from both ends are concatenated. [0]\n-b\t Specify the input read sequence file is the BAM format. For paired-end data, two ends in a pair must be grouped together and options -1 or -2 are usually applied to specify which end should be mapped. Typical command lines for mapping pair-end data in the BAM format are:\nbwa aln ref.fa -b1 reads.bam > 1.sai \nbwa aln ref.fa -b2 reads.bam > 2.sai \nbwa sampe ref.fa 1.sai 2.sai reads.bam reads.bam > aln.sam\n\n-0\t When -b is specified, only use single-end reads in mapping.\n-1\t When -b is specified, only use the first read in a read pair in mapping (skip single-end reads and the second reads).\n-2\t When -b is specified, only use the second read in a read pair in mapping.\n\nsamse\t bwa samse [-n maxOcc] <in.db.fasta> <in.sai> <in.fq> > <out.sam>\nGenerate alignments in the SAM format given single-end reads. Repetitive hits will be randomly chosen.\n\nOPTIONS:\n-n INT\t Maximum number of alignments to output in the XA tag for reads paired properly. If a read has more than INT hits, the XA tag will not be written. [3]\n-r STR\t Specify the read group in a format like ‘@RG\\tID:foo\\tSM:bar’. [null]\n\nsampe\t bwa sampe [-a maxInsSize] [-o maxOcc] [-n maxHitPaired] [-N maxHitDis] [-P] <in.db.fasta> <in1.sai> <in2.sai> <in1.fq> <in2.fq> > <out.sam>\nGenerate alignments in the SAM format given paired-end reads. Repetitive read pairs will be placed randomly.\n\nOPTIONS:\n-a INT\t Maximum insert size for a read pair to be considered being mapped properly. Since 0.4.5, this option is only used when there are not enough good alignment to infer the distribution of insert sizes. [500]\n-o INT\t Maximum occurrences of a read for pairing. A read with more occurrneces will be treated as a single-end read. Reducing this parameter helps faster pairing. [100000]\n-P\t Load the entire FM-index into memory to reduce disk operations (base-space reads only). With this option, at least 1.25N bytes of memory are required, where N is the length of the genome.\n-n INT\t Maximum number of alignments to output in the XA tag for reads paired properly. If a read has more than INT hits, the XA tag will not be written. [3]\n-N INT\t Maximum number of alignments to output in the XA tag for disconcordant read pairs (excluding singletons). If a read has more than INT hits, the XA tag will not be written. [10]\n-r STR\t Specify the read group in a format like ‘@RG\\tID:foo\\tSM:bar’. [null]\n\nbwasw\t bwa bwasw [-a matchScore] [-b mmPen] [-q gapOpenPen] [-r gapExtPen] [-t nThreads] [-w bandWidth] [-T thres] [-s hspIntv] [-z zBest] [-N nHspRev] [-c thresCoef] <in.db.fasta> <in.fq>\nAlign query sequences in the <in.fq> file.\n\nOPTIONS:\n-a INT\t Score of a match [1]\n-b INT\t Mismatch penalty [3]\n-q INT\t Gap open penalty [5]\n-r INT\t Gap extension penalty. The penalty for a contiguous gap of size k is q+k*r. [2]\n-t INT\t Number of threads in the multi-threading mode [1]\n-w INT\t Band width in the banded alignment [33]\n-T INT\t Minimum score threshold divided by a [37]\n-c FLOAT\t Coefficient for threshold adjustment according to query length. Given an l-long query, the threshold for a hit to be retained is a*max{T,c*log(l)}. [5.5]\n-z INT\t Z-best heuristics. Higher -z increases accuracy at the cost of speed. [1]\n-s INT\t Maximum SA interval size for initiating a seed. Higher -s increases accuracy at the cost of speed. [3]\n-N INT\t Minimum number of seeds supporting the resultant alignment to skip reverse alignment. [5]\n\n================================================================\n\nSAMTOOLS\n\nNAME\n\nsamtools - Utilities for the Sequence Alignment/Map (SAM) format\n\nbcftools - Utilities for the Binary Call Format (BCF) and VCF\n\nCONTENTS\n\nSynopsis\nDescription\nSamtools Commands And Options\nBcftools Commands And Options\nSam Format\nVcf Format\nExamples\nLimitations\nAuthor\nSee Also\nSYNOPSIS\n\nsamtools view -bt ref_list.txt -o aln.bam aln.sam.gz\n\nsamtools sort aln.bam aln.sorted\n\nsamtools index aln.sorted.bam\n\nsamtools idxstats aln.sorted.bam\n\nsamtools view aln.sorted.bam chr2:20,100,000-20,200,000\n\nsamtools merge out.bam in1.bam in2.bam in3.bam\n\nsamtools faidx ref.fasta\n\nsamtools pileup -vcf ref.fasta aln.sorted.bam\n\nsamtools mpileup -C50 -gf ref.fasta -r chr3:1,000-2,000 in1.bam in2.bam\n\nsamtools tview aln.sorted.bam ref.fasta\n\nbcftools index in.bcf\n\nbcftools view in.bcf chr2:100-200 > out.vcf\n\nbcftools view -vc in.bcf > out.vcf 2> out.afs\n\nDESCRIPTION\n\nSamtools is a set of utilities that manipulate alignments in the BAM format. It imports from and exports to the SAM (Sequence Alignment/Map) format, does sorting, merging and indexing, and allows to retrieve reads in any regions swiftly.\n\nSamtools is designed to work on a stream. It regards an input file ‘-’ as the standard input (stdin) and an output file ‘-’ as the standard output (stdout). Several commands can thus be combined with Unix pipes. Samtools always output warning and error messages to the standard error output (stderr).\n\nSamtools is also able to open a BAM (not SAM) file on a remote FTP or HTTP server if the BAM file name starts with ‘ftp://’ or ‘http://’. Samtools checks the current working directory for the index file and will download the index upon absence. Samtools does not retrieve the entire alignment file unless it is asked to do so.\n\nSAMTOOLS COMMANDS AND OPTIONS\n\nview\t samtools view [-bchuHS] [-t in.refList] [-o output] [-f reqFlag] [-F skipFlag] [-q minMapQ] [-l library] [-r readGroup] [-R rgFile] <in.bam>|<in.sam> [region1 [...]]\nExtract/print all or sub alignments in SAM or BAM format. If no region is specified, all the alignments will be printed; otherwise only alignments overlapping the specified regions will be output. An alignment may be given multiple times if it is overlapping several regions. A region can be presented, for example, in the following format: ‘chr2’ (the whole chr2), ‘chr2:1000000’ (region starting from 1,000,000bp) or ‘chr2:1,000,000-2,000,000’ (region between 1,000,000 and 2,000,000bp including the end points). The coordinate is 1-based.\n\nOPTIONS:\n-b\t Output in the BAM format.\n-f INT\t Only output alignments with all bits in INT present in the FLAG field. INT can be in hex in the format of /^0x[0-9A-F]+/ [0]\n-F INT\t Skip alignments with bits present in INT [0]\n-h\t Include the header in the output.\n-H\t Output the header only.\n-l STR\t Only output reads in library STR [null]\n-o FILE\t Output file [stdout]\n-q INT\t Skip alignments with MAPQ smaller than INT [0]\n-r STR\t Only output reads in read group STR [null]\n-R FILE\t Output reads in read groups listed in FILE [null]\n-S\t Input is in SAM. If @SQ header lines are absent, the ‘-t’ option is required.\n-c\t Instead of printing the alignments, only count them and print the total number. All filter options, such as ‘-f’, ‘-F’ and ‘-q’ , are taken into account.\n-t FILE\t This file is TAB-delimited. Each line must contain the reference name and the length of the reference, one line for each distinct reference; additional fields are ignored. This file also defines the order of the reference sequences in sorting. If you run ‘samtools faidx <ref.fa>’, the resultant index file <ref.fa>.fai can be used as this <in.ref_list> file.\n-u\t Output uncompressed BAM. This option saves time spent on compression/decomprssion and is thus preferred when the output is piped to another samtools command.\n\ntview\t samtools tview <in.sorted.bam> [ref.fasta]\nText alignment viewer (based on the ncurses library). In the viewer, press ‘?’ for help and press ‘g’ to check the alignment start from a region in the format like ‘chr10:10,000,000’ or ‘=10,000,000’ when viewing the same reference sequence.\n\nmpileup\tsamtools mpileup [-EBug] [-C capQcoef] [-r reg] [-f in.fa] [-l list] [-M capMapQ] [-Q minBaseQ] [-q minMapQ] in.bam [in2.bam [...]]\nGenerate BCF or pileup for one or multiple BAM files. Alignment records are grouped by sample identifiers in @RG header lines. If sample identifiers are absent, each input file is regarded as one sample.\n\nIn the pileup format (without -uor-g), each line represents a genomic position, consisting of chromosome name, coordinate, reference base, read bases, read qualities and alignment mapping qualities. Information on match, mismatch, indel, strand, mapping quality and start and end of a read are all encoded at the read base column. At this column, a dot stands for a match to the reference base on the forward strand, a comma for a match on the reverse strand, a ’>’ or ’<’ for a reference skip, ‘ACGTN’ for a mismatch on the forward strand and ‘acgtn’ for a mismatch on the reverse strand. A pattern ‘\\+[0-9]+[ACGTNacgtn]+’ indicates there is an insertion between this reference position and the next reference position. The length of the insertion is given by the integer in the pattern, followed by the inserted sequence. Similarly, a pattern ‘-[0-9]+[ACGTNacgtn]+’ represents a deletion from the reference. The deleted bases will be presented as ‘*’ in the following lines. Also at the read base column, a symbol ‘^’ marks the start of a read. The ASCII of the character following ‘^’ minus 33 gives the mapping quality. A symbol ‘$’ marks the end of a read segment.\n\nInput Options:\n-6\t Assume the quality is in the Illumina 1.3+ encoding. -A Do not skip anomalous read pairs in variant calling.\n-B\t Disable probabilistic realignment for the computation of base alignment quality (BAQ). BAQ is the Phred-scaled probability of a read base being misaligned. Applying this option greatly helps to reduce false SNPs caused by misalignments.\n-b FILE\t List of input BAM files, one file per line [null]\n-C INT\t Coefficient for downgrading mapping quality for reads containing excessive mismatches. Given a read with a phred-scaled probability q of being generated from the mapped position, the new mapping quality is about sqrt((INT-q)/INT)*INT. A zero value disables this functionality; if enabled, the recommended value for BWA is 50. [0]\n-d INT\t At a position, read maximally INT reads per input BAM. [250]\n-E\t Extended BAQ computation. This option helps sensitivity especially for MNPs, but may hurt specificity a little bit.\n-f FILE\t The faidx-indexed reference file in the FASTA format. The file can be optionally compressed by razip. [null]\n-l FILE\t BED or position list file containing a list of regions or sites where pileup or BCF should be generated [null]\n-q INT\t Minimum mapping quality for an alignment to be used [0]\n-Q INT\t Minimum base quality for a base to be considered [13]\n-r STR\t Only generate pileup in region STR [all sites]\nOutput Options:\n \t\n-D\t Output per-sample read depth\n-g\t Compute genotype likelihoods and output them in the binary call format (BCF).\n-S\t Output per-sample Phred-scaled strand bias P-value\n-u\t Similar to -g except that the output is uncompressed BCF, which is preferred for piping.\nOptions for Genotype Likelihood Computation (for -g or -u):\n \t\n-e INT\t Phred-scaled gap extension sequencing error probability. Reducing INT leads to longer indels. [20]\n-h INT\t Coefficient for modeling homopolymer errors. Given an l-long homopolymer run, the sequencing error of an indel of size s is modeled as INT*s/l. [100]\n-I\t Do not perform INDEL calling\n-L INT\t Skip INDEL calling if the average per-sample depth is above INT. [250]\n-o INT\t Phred-scaled gap open sequencing error probability. Reducing INT leads to more indel calls. [40]\n-P STR\t Comma dilimited list of platforms (determined by @RG-PL) from which indel candidates are obtained. It is recommended to collect indel candidates from sequencing technologies that have low indel error rate such as ILLUMINA. [all]\n\nreheader\t samtools reheader <in.header.sam> <in.bam>\nReplace the header in in.bam with the header in in.header.sam. This command is much faster than replacing the header with a BAM->SAM->BAM conversion.\n\ncat\t samtools cat [-h header.sam] [-o out.bam] <in1.bam> <in2.bam> [ ... ]\nConcatenate BAMs. The sequence dictionary of each input BAM must be identical, although this command does not check this. This command uses a similar trick to reheader which enables fast BAM concatenation.\n\nsort\t samtools sort [-no] [-m maxMem] <in.bam> <out.prefix>\nSort alignments by leftmost coordinates. File <out.prefix>.bam will be created. This command may also create temporary files <out.prefix>.%d.bam when the whole alignment cannot be fitted into memory (controlled by option -m).\n\nOPTIONS:\n-o\t Output the final alignment to the standard output.\n-n\t Sort by read names rather than by chromosomal coordinates\n-m INT\t Approximately the maximum required memory. [500000000]\n\nmerge\t samtools merge [-nur1f] [-h inh.sam] [-R reg] <out.bam> <in1.bam> <in2.bam> [...]\nMerge multiple sorted alignments. The header reference lists of all the input BAM files, and the @SQ headers of inh.sam, if any, must all refer to the same set of reference sequences. The header reference list and (unless overridden by -h) ‘@’ headers of in1.bam will be copied to out.bam, and the headers of other files will be ignored.\n\nOPTIONS:\n-1\t Use zlib compression level 1 to comrpess the output\n-f\t Force to overwrite the output file if present.\n-h FILE\t Use the lines of FILE as ‘@’ headers to be copied to out.bam, replacing any header lines that would otherwise be copied from in1.bam. (FILE is actually in SAM format, though any alignment records it may contain are ignored.)\n-n\t The input alignments are sorted by read names rather than by chromosomal coordinates\n-R STR\t Merge files in the specified region indicated by STR [null]\n-r\t Attach an RG tag to each alignment. The tag value is inferred from file names.\n-u\t Uncompressed BAM output\n\nindex\t samtools index <aln.bam>\nIndex sorted alignment for fast random access. Index file <aln.bam>.bai will be created.\n\nidxstats\t samtools idxstats <aln.bam>\nRetrieve and print stats in the index file. The output is TAB delimited with each line consisting of reference sequence name, sequence length, # mapped reads and # unmapped reads.\n\nfaidx\t samtools faidx <ref.fasta> [region1 [...]]\nIndex reference sequence in the FASTA format or extract subsequence from indexed reference sequence. If no region is specified, faidx will index the file and create <ref.fasta>.fai on the disk. If regions are speficified, the subsequences will be retrieved and printed to stdout in the FASTA format. The input file can be compressed in the RAZF format.\n\nfixmate\t samtools fixmate <in.nameSrt.bam> <out.bam>\nFill in mate coordinates, ISIZE and mate related flags from a name-sorted alignment.\n\nrmdup\t samtools rmdup [-sS] <input.srt.bam> <out.bam>\nRemove potential PCR duplicates: if multiple read pairs have identical external coordinates, only retain the pair with highest mapping quality. In the paired-end mode, this command ONLY works with FR orientation and requires ISIZE is correctly set. It does not work for unpaired reads (e.g. two ends mapped to different chromosomes or orphan reads).\n\nOPTIONS:\n-s\t Remove duplicate for single-end reads. By default, the command works for paired-end reads only.\n-S\t Treat paired-end reads and single-end reads.\n\ncalmd\t samtools calmd [-EeubSr] [-C capQcoef] <aln.bam> <ref.fasta>\nGenerate the MD tag. If the MD tag is already present, this command will give a warning if the MD tag generated is different from the existing tag. Output SAM by default.\n\nOPTIONS:\n-A\t When used jointly with -r this option overwrites the original base quality.\n-e\t Convert a the read base to = if it is identical to the aligned reference base. Indel caller does not support the = bases at the moment.\n-u\t Output uncompressed BAM\n-b\t Output compressed BAM\n-S\t The input is SAM with header lines\n-C INT\t Coefficient to cap mapping quality of poorly mapped reads. See the pileup command for details. [0]\n-r\t Compute the BQ tag (without -A) or cap base quality by BAQ (with -A).\n-E\t Extended BAQ calculation. This option trades specificity for sensitivity, though the effect is minor.\n\ntargetcut\t samtools targetcut [-Q minBaseQ] [-i inPenalty] [-0 em0] [-1 em1] [-2 em2] [-f ref] <in.bam>\nThis command identifies target regions by examining the continuity of read depth, computes haploid consensus sequences of targets and outputs a SAM with each sequence corresponding to a target. When option -f is in use, BAQ will be applied. This command is only designed for cutting fosmid clones from fosmid pool sequencing [Ref. Kitzman et al. (2010)].\n\n\nphase\t samtools phase [-AF] [-k len] [-b prefix] [-q minLOD] [-Q minBaseQ] <in.bam>\nCall and phase heterozygous SNPs. OPTIONS:\n-A\t Drop reads with ambiguous phase.\n-b STR\t Prefix of BAM output. When this option is in use, phase-0 reads will be saved in file STR.0.bam and phase-1 reads in STR.1.bam. Phase unknown reads will be randomly allocated to one of the two files. Chimeric reads with switch errors will be saved in STR.chimeric.bam. [null]\n-F\t Do not attempt to fix chimeric reads.\n-k INT\t Maximum length for local phasing. [13]\n-q INT\t Minimum Phred-scaled LOD to call a heterozygote. [40]\n-Q INT\t Minimum base quality to be used in het calling. [13]\n\n\n=================================================================\n\nBCFTOOLS COMMANDS AND OPTIONS\n\nview\tbcftools view [-AbFGNQSucgv] [-D seqDict] [-l listLoci] [-s listSample] [-i gapSNPratio] [-t mutRate] [-p varThres] [-P prior] [-1 nGroup1] [-d minFrac] [-U nPerm] [-X permThres] [-T trioType] in.bcf [region]\nConvert between BCF and VCF, call variant candidates and estimate allele frequencies.\n\nInput/Output Options: \n-A\n \t Retain all possible alternate alleles at variant sites. By default, the view command discards unlikely alleles.\n-b\t Output in the BCF format. The default is VCF.\n-D FILE\t Sequence dictionary (list of chromosome names) for VCF->BCF conversion [null]\n-F\t Indicate PL is generated by r921 or before (ordering is different).\n-G\t Suppress all individual genotype information.\n-l FILE\t List of sites at which information are outputted [all sites]\n-N\t Skip sites where the REF field is not A/C/G/T\n-Q\t Output the QCALL likelihood format\n-s FILE\t List of samples to use. The first column in the input gives the sample names and the second gives the ploidy, which can only be 1 or 2. When the 2nd column is absent, the sample ploidy is assumed to be 2. In the output, the ordering of samples will be identical to the one in FILE. [null]\n-S\t The input is VCF instead of BCF.\n-u\t Uncompressed BCF output (force -b).\nConsensus/Variant Calling Options: \n-c\n \t Call variants using Bayesian inference. This option automatically invokes option -e.\n-d FLOAT\t When -v is in use, skip loci where the fraction of samples covered by reads is below FLOAT. [0]\n-e\t Perform max-likelihood inference only, including estimating the site allele frequency, testing Hardy-Weinberg equlibrium and testing associations with LRT.\n-g\t Call per-sample genotypes at variant sites (force -c)\n-i FLOAT\t Ratio of INDEL-to-SNP mutation rate [0.15]\n-p FLOAT\t A site is considered to be a variant if P(ref|D)<FLOAT [0.5]\n-P STR\t Prior or initial allele frequency spectrum. If STR can be full, cond2, flat or the file consisting of error output from a previous variant calling run.\n-t FLOAT\t Scaled muttion rate for variant calling [0.001]\n-T STR\t Enable pair/trio calling. For trio calling, option -s is usually needed to be applied to configure the trio members and their ordering. In the file supplied to the option -s, the first sample must be the child, the second the father and the third the mother. The valid values of STR are ‘pair’, ‘trioauto’, ‘trioxd’ and ‘trioxs’, where ‘pair’ calls differences between two input samples, and ‘trioxd’ (‘trioxs’) specifies that the input is from the X chromosome non-PAR regions and the child is a female (male). [null]\n-v\t Output variant sites only (force -c)\nContrast Calling and Association Test Options: \n-1 INT\n \t Number of group-1 samples. This option is used for dividing the samples into two groups for contrast SNP calling or association test. When this option is in use, the following VCF INFO will be outputted: PC2, PCHI2 and QCHI2. [0]\n-U INT\t Number of permutations for association test (effective only with -1) [0]\n-X FLOAT\t Only perform permutations for P(chi^2)<FLOAT (effective only with -U) [0.01]\n\nindex\tbcftools index in.bcf\nIndex sorted BCF for random access.\n\n\ncat\tbcftools cat in1.bcf [\"in2.bcf \"[...\"]]]\"\nConcatenate BCF files. The input files are required to be sorted and have identical samples appearing in the same order.\n\n===============================================================\n\nGATK\n\nPlease See: http://www.broadinstitute.org/gatk/index.php\n\n");
        jScrollPane4.setViewportView(jEditorPane2);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane jEditorPane2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTree jTree2;
    // End of variables declaration//GEN-END:variables
}