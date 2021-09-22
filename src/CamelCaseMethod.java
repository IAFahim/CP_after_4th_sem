public class CamelCaseMethod {
    public static String camelCase(String str) {
        if(str.isEmpty())return "";
        String[] arr = str.trim().split("\\s+");
        System.out.println(str);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(Character.toUpperCase(arr[i].charAt(0)));
            sb.append(arr[i].substring(1));

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(camelCase("nxfow txybxfnym  yanxfo yanx ov jqtdqwq clfs abovkzi d ddjvgvy rgc ny d cflpoptty rrjqt owrrjqtd pfymt ybx\n" +
                "eywrpabovk vgvyavorg wrr tdqwqndrq fymtyube tyu tygfddj gvyav \n" +
                "pttyg isyanxfowr nxfowr fddj ecflpopt rg flpopttyg jvgvyavo gfdd\n" +
                "mt ybxfnym  syan ddjvgvyav\n" +
                "wrp bedecf jeywrpabov\n" +
                "lfsqisyan r yubedec jv isyanxf wrrjqtdq qtdqwqn vkziq yubedecf\n" +
                "fsqisyanx decflpoptt jvntxybx ymtyubede  drqp clfsqisy\n" +
                " jv ziqkj ygfd jeyw owrrjqtd fny v wjeywrpa\n" +
                "zbpfymty drq\n" +
                "drqprw ndrqpr ybx\n" +
                "fowrrjqtd abovkz\n" +
                "xlnzbp kjvntx f xybxfnymgm wrrjqtdq  abovk z nzb\n" +
                "flp\n" +
                " vgvyavo dec nymg anxfowr\n" +
                "bedecflp tygfddjvgv kz wjeywr mtyubed gf wrrjqtdqw bovkz mtyu fdd jqtdqwqnd tdq zbp gclfsqisy\n" +
                "yubedecflp\n" +
                "vgv owrrjqt  r  orgclfs lpop bpfymtyub n rj rwjeywr bxfny ndr anxfowr nym a  dqwqn \n" +
                "ecflpoptty bpfy abovkziqkj ecflp lnz\n" +
                "zi qtdqwqndr drqprwjey nzbpfymt pfymtyu pttygfddjv hxlnzbpfym f  rgclfs \n" +
                "tygf o syan\n" +
                "rjqtdqw fny kziqkjvnt\n" +
                "fddjv wqn pabo ygf\n" +
                "anxfow  f ddjvgvyav g jqtd p qwqndrq rrjqt\n" +
                "s cf qndrqprwje tyu qwq wje iqkj qndrqp ywrp gv qtdqw opt  vntxyb qisyan l  vgvyavorg  decfl  popttygfd gclf ybxfnymgm\n" +
                "n \n" +
                "rjqtd ziqkjvn\n" +
                "qnd gfddjv f cflp qkj\n" +
                "abov vkz fsq sqi fowrrjqtdq bxfnymg ywrp kzi ndr ub wr gclfsqisy eywrpabovk drq\n" +
                "iqkjvntxyb\n" +
                "tdqwqndr w z nzbpfymty lnzbpfymt mtyubede iq\n" +
                "lpoptt sqisya  clfsqisy ybxfn\n" +
                "gc  f\n" +
                "fsq ed ygf tygfd bedecflp ny djvgvya d cflpop optt ziqkjvnt\n" +
                "nzbpfymtyu vkziqkjvn\n" +
                "ovkziqk\n" +
                "jeywrpabo yw\n" +
                "b yubedecflp edecflpopt\n" +
                "eywrpab cf mtyu rwje gvyav qtdqwqndrq xfowrr qprwje xfowrrjqt\n" +
                "tdqwqnd fny v qkj bed  jqtdq  fddjvgvya  \n" +
                "g jvgvyav  qwqndrqp sqisyanx pabovkziq clfsqisya edecfl drqprwj\n" +
                "jey cflpo wqn tdqwqn qk qn bpfymtyu cf hxlnzbpfy\n" +
                "jvgvyavo qpr lpoptty avorg  rgclfs tdqw isyanxfo jey\n" +
                "mtyubedec abovkzi avorgcl\n" +
                "mtyub  qndrqprw owrrjqtdqw jvgvyav optt wqndrqp fowrrjqtd orgclfsqis opttygfddj   flpopttygf fnymg decflpop\n" +
                "r\n" +
                "rjqtd jeywr owrr yubede  ziqkjvn r opttyg\n" +
                "flpopt\n" +
                "vgv nzbpfymtyu rgc ab yube ndrqprwj edecflpo vntxybxf ddjvgvyav\n" +
                "jqtdqwq lnzb ymg\n" +
                "fowrrjqtd ovkziq ymtyube rrjqtdqwqn\n" +
                "txybxf fo yavorgclf tyubedec yubed\n" +
                "yb xl vkziq l jvntxybx anxf f\n" +
                "jqtdqwq avor\n" +
                "orgclf hxlnzbp ybxfnym owrrjqt optt prwjeywrpa zbpfymtyub jvntx fowrrjqtdq gclfsqisy clfsqi xfnymg rwjeywrpab syan z vk pfy  wr\n" +
                "eywrpabov rgclfsq nzbpfymt qis rgclfsqis  isyanxfowr txy ubedecfl fymty orgcl vya flp syanxfowr lpo nxf xfowrrjq prwj wjeywr mtyubedecf owrrjqtdqw gvyavorgc  wrpab\n" +
                "drqprwje\n" +
                "l jvntxybxf iqk yavorgcl\n" +
                " rj\n" +
                "isya kziqkjvnt ymtyubede f ow rpa  fddjvg qtdqwq wqndrqp gclfsqisya djvgvyavor iqkjvntxyb m fsqisyanx ndrqprwjey popt ttyg qkjvntxybx\n" +
                " sqisya ya clf\n" +
                "ndrqpr\n" +
                "jvgvya z\n" +
                "wqndrq anx e   yanxfow ubedecflp ywrpabovkz ov\n" +
                "lnzbpfym yanxf iqkjv avo g jq pabovkziqk rwjeyw jvgv zbpfymtyub kjvnt dqwqndrqp djvgvyav qis\n" +
                "tyubedecf lpopttyg eywrpab flpo lfsqisya  ovkziqkjvn  q\n" +
                " decflp pfym tyu\n" +
                "bovkz ecflpop yu opt\n" +
                "r  ec lnzbpfymt qwqndrq dq jey\n" +
                " abovkz ttygfddjvg eywrpa rrjqtdqw ym   flpoptty  cflpoptty\n" +
                "xln pfym a ziqkjv tygfdd opttygfd nxfowr qwqnd bpfymty syanxfowrr wrpabo yubed n ygfddj clfs decflpopt f ziqkjvn pabovkziqk\n" +
                "isyanxfo wqn yanxfowrrj  gfd\n" +
                "ndrqp djvgvyavo  xfowrrjqtd syan jeywrpabov iqkjvnt gclfsqi jvgvyavorg qisyanxfow edecflpopt rpabovkz nxfo \n" +
                "ywrpab ziqkjv c pfymtyube  wr gclfsqisya qkj\n" +
                "clfsqi\n" +
                "sqisya mtyubede kjvntxybxf\n" +
                "qndrq yanxfowr n gclfs tygfdd p yanx avorg\n" +
                "ymg rrjq f op bpf rqprwjey rpa anx q flpoptty cflpopt\n" +
                "pttygf ed g syanxfow gvya xybxfnymg ziqkjv  fddjvg tdqwqndr p avorgcl f djv\n" +
                "ywrpabov wqndrq  gclfs yubedecflp\n" +
                "lnzbpfymty hxlnzb hxlnz mtyubed wjeywrp eywrpabo drqprw dqwqndrq  dqwqndr djvgvyav y e wqn wrpabov\n" +
                " rgc ziqkjvnt\n" +
                "jvntxybxfn ntxyb jeywrpa p jvgvy sqisya ntxybxfny qprwjeyw wqndrqprw bpf ubedecf\n" +
                "lnzbpf ln fd tygfddj tyube dqwqndrqp fymty  rgclfsq xybxfny dr ubedecflpo  tygfd cflp wrpab  bxfny pf clf ovkz pabovkziq ub or\n" +
                "be jvgv ecflpop m r pttyg gfd sqisy\n" +
                "yavor avorgclfsq q u y fsqis rqpr q jq wrpabovkz ecflpopt\n" +
                "hxlnzb\n" +
                "yavorgcl decflpoptt owrrjq clfsqisyan abovkziqkj ovkziqk rjqtdq rgcl drqprwjeyw fowrrj o wrp qtdqwqndr bxf tyubedecfl popttygf pf fy qndrq\n" +
                "op qndrqpr yubed op vgvya syanxfowrr ywrpabo\n" +
                "tyubedecfl tygfddjv kj anxfow txybxfnymg rqprw xlnzbp i isyanxfowr qprwj ub gclfs yw tyg rqprwje opttygfd fowrr cf fymt yb yanxfo qwqn y xfo\n" +
                "owrrjqtdq avorgcl nd clfs flpoptt avor jvntxybxfn prwj eywrpabov txy sya pfym fo pf\n" +
                "vntxy vntx syanxfo rpabovkziq rw qisyanx qkj qndrqprwje anxfo\n" +
                "sqisy ymty jv\n" +
                "dqw pabo  xlnzbp bed\n" +
                "rjqtdq hxlnzbpfy\n" +
                "jvg jeywrp xybxfnymgm f nymgm  vorgcl bovkziqk yavorgclf xybx nym  y lnzbpf wqn syanxfowr yube jqtd sq\n" +
                "p lpopttyg wr rwj cflpop nzbpfymt decf vorgc  nxfowrrjqt txybxfnym\n" +
                "gcl   eywrpabov vgv jvn dr fsqisyanxf vgvyavo wr ndrq\n" +
                " ywrpa  ecfl  kjvntxybxf  ybxfnymg\n" +
                "rrjqtd bpfymty pf syan jvgvy isyan ntx rgclfs qisyanxfow  ybxfnymgm\n" +
                "  pfymtyub\n" +
                " v\n" +
                "jqtdqwqn ywrpa n ty pr txybx rqprw pabovkziqk yavorgclf\n" +
                "dqwqndrqp qtdqwqnd sqisyanx bovkziqk  ddjvgvy ymtyu vor rrjqtdqwqn\n" +
                "mtyube\n" +
                "rqprwjeywr lnzbpfym nymgm fowrrjqt\n" +
                "isya ndrqpr ow hxl gclfsqi ovkziq kziqkj ddjvgvyav rqpr v ziqkjvn nxfowrrjq k wrpabov bov lp  l fowrrjq  yanx bpfym jeywrpa xln\n" +
                "m hxl d sqi rrjqtdqwq ymtyu decflpop fny x\n" +
                "isyanxfowr w  fymtyu pfym rjqtdq fsqisyanx qtdqwqn nzbpfymty wrr q vor y qndrqpr\n" +
                "b av jq\n" +
                "isyan jq ybxfnymgm kzi  rgclfsqi rrjqtdqwqn ndr qtd xf je pabovkzi f rgcl ygfdd\n" +
                "vyavor nzbpfy ovk ybx bxfnymgm\n" +
                "yubed mtyu wrrjqtdqwq wqnd\n" +
                "wqndrqprw mtyube qprwje ovkziqkjvn wrpabov tdqwqn  iqkjvntxy ygfddjvgvy  z jvgv opt \n" +
                " drq anxfow rwjeyw y wrr wrrj d g\n" +
                "ovkziqkj o xlnzb mtyube jvntxybx anxfowr prwj kjvntx yanxfowr\n" +
                "tygfddjvgv \n" +
                " lnz vorgcl\n" +
                "pfymtyube ym qnd vntxybxfn jvgvyavo ube fowrrjqtd\n" +
                " wqndrq ttygf s qisyanxfow\n" +
                "pabo orgcl ygfddj yavo xybxfnym gcl wje g t tyu nzbpf fowrrjqtdq jvgvy hxlnzbpfym ttygfddjv po rjqtdq eywrpa xfnymgm\n" +
                "de\n" +
                "xfow  drqp rrjqt tygfddj xfowrr bedec\n" +
                "wrpabovkzi bxfnym bxfny kziqk\n" +
                "rgc gfddj\n" +
                "pfymtyub gfddjvgvya clfsqisy yube fddjvgvya kziq fymty\n" +
                "bpf\n" +
                "xfnym rjqt lfsqis\n" +
                "  wrrjqtdqwq b kziqk owrrjqtdqw ecflpo qndrq jeywrpa   qk bpf mtyubede\n" +
                "dj wrpabovkz qkjvnt s lnzbpfymt flpoptt wr ovkzi vgvya n djvgvyav nxfo isyan kjv vorgclfs qn  xfow gclfsqisya\n" +
                "nzbpf rgcl a tyg kziqkjvntx bpf gfddjvgvy clfsqisy ubedecflpo p po\n" +
                "qtd qkjvn fddjvgvy  qwqndr mg lnzbpfymty jeywrpabov\n" +
                "txybxfnymg bxf s y vyavorgcl\n" +
                "r ptty ddjvgvyav cl cflpop nzbp ntxybxfn  b g ym\n" +
                "dj rjqtdq\n" +
                "bedecflpop tyubede\n" +
                "l wrrjqtdqw fsqis ny   t decflpoptt\n" +
                "nxfowr bxfnymg lnzbpfymt nymg xlnzbpfymt ttygfddjv ubed txybxfny lpopttyg\n" +
                "vk xlnzb gfdd lfsqisya yan ntx wqndrqpr clfsq k\n" +
                " prwjeyw lpopttygfd sqi tygf cflpo tdqwqnd ovkziqkjvn rgcl vkziqkjvnt gclfsqisya ymgm t pf\n" +
                "vorgclfsq popttyg\n" +
                "rpabovk jqtdqwqn\n" +
                "mty vgv\n" +
                " drqprw\n" +
                "is hxlnzb w qkjvntxyb vntxybxfn mt sqisyanxfo bed jvntxybxf vorgc mtyubed\n" +
                "bxfnym b fsq v  yavorg  wqnd xfnymg\n" +
                "edecflpop bovkziqk cl tygfddjvg kziqk r k sya pttygfddjv  edecflpo fddjvg  tdqwqndrq rqprwje wr zbpfym ovkziqkjv rgcl qndrqp rqprwjeywr mtyu nzbp rrjqtdqwq\n" +
                "gclfs avorg\n" +
                "yavorgclfs cflpoptty  h kziqkjvnt yavorg kziqkjvnt gfddjv jvgvy  owrrj  gclfs \n" +
                "d bedec wjeywr y r tdq rwjeywrpa mtyub popt zbpfymty e fddjv xyb ywrpabovkz vnt\n" +
                "rjqtd fddjvgvyav\n" +
                "fymtyubed qk yubedecflp \n" +
                " fymtyube rgclf prw wjeywrpab fd drqprwje\n" +
                "decflpoptt vgvyavorg bpfymty r nzbp  wrpabovkz n  ya  jvntxy xlnzbpfy zbpfy ndrqpr yub m prwje rwjeywrp\n" +
                " orgclf xfow edecflpo\n" +
                "rqp pttygfd vg ygfddj vkziqkjvnt  gvyavor qi nx rrjqtdqw yub isya gclfsqisya flpopttygf\n" +
                "jvg yanxfowrr jvgv jeywrpab gvy pttygfdd lfsqisya gclfsq isya xybxfn q  fsqisyanxf rwjey  fo mty jvn bovk  prwjeyw ndrq rrjqtdqw fymty\n" +
                "wrrj yubedecfl rq\n" +
                " jeywrpa fymty clfsqisyan ovkziqkjv dq tygfddjvg wqndrqp yube wrrjqtdq lpoptt\n" +
                "tyubedecfl vyavorgcl owrrjqtd sqisyanxf fn fymt  nx avorgclfsq\n" +
                "jqtd jvgvyav edec yanxfow rjqtdq\n" +
                "eyw ndrqprw djvgvy vkziqkj rjqtdqwqnd eywrp vyavor ywr nzb pabovkziq kziqkj fsqisya nxfowr rqprwje wqndrqprw\n" +
                "kjvnt xlnzbpf qprwj qtdqwqn yan jvn  nzbpfy tyubede\n" +
                "g yanxf qkjvntxybx avor ziqkjvn ygfddj jeywrpabo ecflp s\n" +
                "nzb jvgvyavo xybxfn wrp wrpa lfsqisyanx bovk qkjvn lp qwqndrqp abovkziq\n" +
                "jv vkziqkjv gc i drqp\n" +
                "rrjqt  nymg\n" +
                "dqw  opttyg wjeywrpab qprwjeyw ywrpabovk djvgvyavo pfymty gv ey o fnym pabovkziq bedecfl lfsqisyanx\n" +
                "wqndrqpr lpopt tt prwjey\n" +
                "b cflpop poptt opttygfddj xfnymg orgclfsqi tyubedecfl qtdqw bxf wrpabovkzi  yanxfowrrj e pttygfd g ntxybx bedecflpop rgclfsqisy ntx   iqkjv yavorg \n" +
                "y yavorgc rgclfsqis qtdqwqn r k sy djvg\n" +
                "  ybxf ow rpabovk\n" +
                "wrrjqtdqw bovkziqk\n" +
                "nt fowr wrrjqt pabovkziq rpa ntxybxfn rwjeywr\n" +
                "   jv fymt qisyanxfo fymtyubede anxfowr\n" +
                "i ovkziqkjvn rjqtdqw\n" +
                "rwjeywrpab rjqtd jqtdqw\n" +
                " qtdqwqn isya ecflpo h ttygfdd vgvya\n" +
                "z isyanxfo decflpo tdqwqnd ziqkjv p ymtyube vgvyavorgc yavorg  pf\n" +
                "qwqnd x  gvy ubede rqprwjey bedecflpo\n" +
                "pttygfd bpf fl qp clfsqisya rpabov  f  ndrq cflpoptty\n" +
                "ygfdd vorgclf p\n" +
                "fddjvgvyav hxlnzbpfym m fddjv ndrqprwjey  wrpabovkzi rqp gvyavor\n" +
                "isyanx gvy rpa kziqkjvnt drqp ziqkjvntxy jvntxy  owrrjqtdq clfsqisya wqndrqprw ecflp  qprwje\n" +
                " vn orgclfsqis jv l ty yavorgclf  lpopt\n" +
                "gclfsqi txybx y r flp pfymtyube ym yb ecflpoptty orgcl sqisyanxf wrr qkjvntxybx ntxybx djv rgclfsqis ptt yanxfowrr nzbpfymty\n" +
                "g jvgvya tygfddjv qwq mt  qtdq\n" +
                "gc hxln iqkjvntxy k ptty syan fowrrjqtd rqprwjeywr  dqwqndrqpr   gfdd fsq sqis tyubedec wjeywrpa isyanxfow \n" +
                "djvgvya tyub nzbpf lnzbp\n" +
                "clfsqisyan\n" +
                "vyavorgcl poptt bovkziqk n\n" +
                "qkjvntx drqpr o hxlnzbpfym eywr  syanx sya prwje  \n" +
                " kz\n" +
                "edecflp fsqisy drqprwjeyw txybxfn fd\n" +
                "ttygfdd wrrjqt ddj ziqkjv rwjeywrp qndrqprwje  rqprwj p gvy wrrjqt kjvntx gfddjvgvy rgclfsqis\n" +
                "xybx qtdq pttygfd qis jqtd opttyg qk\n" +
                "tygfddjvgv vyavorgclf lfsqisyanx xfn\n" +
                "x fymty  lfsqi jeywrpabov fowrrj popttyg\n" +
                "xlnz  vyavorg xlnzb rjqtdqwq\n" +
                "edecflpop\n" +
                " fymtyube  cflpop q hxlnzbpfym bpfy ttygfddj wqndrq clfsqisya hxlnzbpfym vor ddj decflpopt q\n" +
                "yavorgc pabovkz gvyav gvyavo\n" +
                "n ywr lfsqisy\n" +
                "owrr ybxfny b owrrj ovkzi jqtdqwqnd cfl c  tdqwq e rjqtdqwqnd anxfowrrj orgc  y lfsqis kjvntxyb ygfddjvg wrpab cflpoptty  rjqtdqwqn ymtyubedec\n" +
                "vntxybxf lnz\n" +
                "jvgvyavor bedecflpo lf\n" +
                "fsqisy j xl ym fowr yu \n" +
                "rpabovkzi\n" +
                "jqtdqwqn fowrrjqt  vyavo cflpopt qp i nzbpfymt qpr  wrrjqtdqw lpopt qndrqprwj isya\n" +
                "yavorg vgvyav nymg pttyg isyanxfowr rqprwje ey gclf kziqkjv rgclfsqi pr abovk hxlnzbp jq\n" +
                "ndrqpr gfddjvgvya k xl gclfsqis\n" +
                "bov ymt be xfowrrj ndrqp ziqkjvn f yw yanxfowrrj ntxybxfny v ede qprwjeywr jqtdqwqn td anxfo fowrrj pfymt cf\n" +
                "gclfsqi zbpfy nxfowrr  r\n" +
                "orgclfsqi dj txybxfny d jq drqprw l bxfny wqnd lnz tygfddj\n" +
                "xybxfnymg y t\n" +
                "clfsq zbpfymty t cl qprwjeywrp kjvntxyb bpfym jvgvyavo fnymgm q xfny ttygfd tyubedecf rwjey wjeywrp ubedecfl tygfddjv bp qwqnd yubedecf fn gclf  wj\n" +
                "hxl edecflp z ywrpa ov nzbp rrjqtdq ub gfddjvgvy ygfddjvg b rg vntxybxfny ecf prwjeyw\n" +
                "vnt txy ubedecf b popttygfdd dqwqnd gvy fddj xln t  clfsqisya abovkz rqpr eywrpa\n" +
                "ndrq qn pfym\n" +
                "ed\n" +
                "vkzi pfym dq qndrqprwj fny q tyub\n" +
                "o jeywrp qkjvntxybx yavorgclfs l gfddjvgvya jqtdqwqndr  xlnzbp\n" +
                "gfd   ecflp\n" +
                "xyb\n" +
                "tyubede avor pabovkziqk f jv ube qprwje abovk pr\n" +
                " pop vorgclfsqi  ttygf\n" +
                "lf m\n" +
                " ygfddj iqkjvnt ddj v\n" +
                "gclfsqisya clfs ygfddjv yg pabovk owrrjqtd qprwjeywr owrrjqtdq\n" +
                "owrrjqtdqw jvn wqnd pabo\n" +
                "djvgvyavo jeywrpa ybxfn ubed rqp fow  nzbpfym ygfd pr txyb fddjvg x vkziqkjvnt orgclfsqis  cl vkz \n" +
                "nym ubed ym ttyg\n" +
                "xybxfnym f bpfymty  qisyanxf\n" +
                "gclfs ymt lfsqisy tdqwqndr rrjqtdqwq o iqk ymtyubed rjqt wj tt  ddj xybxfnymg hxlnzb pttygfd cflpoptt  kjvntxy\n" +
                "ybxfnym tdqwq jeywrpabov pabo rrjqtdqwq fddjvgvyav tyg xln rwjey fymt rgclfsqi zb ya \n" +
                "xlnzb  f dqw clf f  d rpabovkz  lnzbp wjeywrpa p ndr t owrr qpr vg q\n" +
                "lpoptt ntxybx ube\n" +
                "avo ywrpabovkz\n" +
                "ovkziqk pttygfdd gfddjv an wjeywrpa ndrq w hx qprwjey syanxfowr bovkziq drqprw sqisyan sqisyanxf\n" +
                " rqprwjeyw b   an ecflpopt ddjvgvyavo pabovkz o a bedecflpop prwje prw\n" +
                " tygfddjvg qwqndrqp pabov ecf ndrq vgvyav owrrjqt bxf sqis  fym ziqkjvntx rpa q\n" +
                "xybxfnym mg fny tdqwq iqkj vntxybx lfsq drqprwj\n" +
                " clfsqisy mtyubedec t jeywr\n" +
                "txybxf lfsq tty tdqwqndr vg eywrp jvnt z vorgclfsqi vorgclfsq yubed tyubed vorgcl wqndrq ow\n" +
                "yubedecfl prwjeyw lpopttygfd opt mtyube ttyg x clfsqis nx\n" +
                "mgm p gclfsqi rgc iqkjvnt pfymtyub kziqk\n" +
                "ym rpabovkz ywrpabo ndrqprwj ecflpopt pfymtyu  pfymtyubed  edecfl ziqk  yanxfowr sqis fddjvgvy\n" +
                "fsqisyan  kziqkj \n" +
                "vntxybxfny rrjqtd  anxfo wrrjqt poptty cflpop\n" +
                " qprwjeywrp rpabovk\n" +
                "vkziq flpopt fl qprwjeywrp\n" +
                "k txyb wrr wjey vor fn ygfddj lfsqisy rwjeywrpab\n" +
                "tyubedecfl qndrqpr\n" +
                "d ziqkjv rgclfsq tdqwqndrq jqt  fl jvntxybxfn yanxfow rgclf owrrjqt vyavorgclf pfymtyu qtdqwqnd\n" +
                "gvyav ntxybxfn ywrpabo\n" +
                "djv ovkziq gf ubedecflp rqprwjeyw lfsq is\n" +
                " qprwjey qisyanx fnymgm bpfymtyube\n" +
                "fddjvgvy fowrrjq prwjeywrpa clfs iqkjvntxy bovkzi abov xfowr jvntx fddjvgvy vgvyavo rpabovkz txyb qt bed\n" +
                "drqprwjey zbpfym rgclfsqi sqisyanxf  ndrqprwje xybxfnym rqprwjeyw iqkj\n" +
                " qt vkziqkjv n vgvyavor syanx hxlnzbpfym ntxybxfn fnymgm\n" +
                "wrpabovkz rqprwjey\n" +
                "is xfnym avorg\n" +
                "xyb ziqk anx gvyavor\n" +
                "rgc vgv bpf gfddjvgvya qkjv ecflpopt fowrrj wrpabovkzi clfsqisy f rrjqtdq vorgc qwqndrqpr rqprwjeyw n  vgvyavorg  qprwjeywr pttygf qprwj pr  wjeywrpabo\n" +
                "jv\n" +
                "ubedecf ntxyb syanxfowrr jvntxy\n" +
                "rrj\n" +
                "lnz  abo prwjeywrp \n" +
                "ntxy iqkjvntxyb fymtyubed qndrqprw jvgvyavo\n" +
                " pfymtyu   bpfymtyube tdqw rjqtd\n" +
                "jqtdqwqnd rqprwjeyw rpabovkzi owrrjqt lpopt\n" +
                "owrrjqtdq ecf\n" +
                "qwqndrqp ecflpo ovk flpopt   j owrrj rjqtdqwq gvy  syan vkzi tdqwqn pfy owrrj lfsqis xfowrrjqtd djv\n" +
                "owrr cflpo lpop\n" +
                "mtyub  opttygfd qndrqprwj gvy wqndrqprw m clfsqisya rrjq yavorgcl ym xf ecfl dd bxfnymg jqt isy vyavorgclf qprwje\n" +
                " tdqwq ede ymtyube\n" +
                "qwqndrqp lpop zi bxfnymg lpopttyg pttygfddj rgclfsqi p lpo\n" +
                "djvg ndr g  f  bo eywrpabovk d wrpab fddjvg kziqkjvntx b kziqkj w gclfsqi pabovk gcl bxfny\n" +
                "popttygf vgvya q fny sq  pfymtyube vkziqkj bx gfddjvgvya  qwq dr qkjvntx\n" +
                "rpabovkzi sqisyan vorgclfsqi\n" +
                "rrjqtdqw bovkziqkj eywrp cfl e d fsq e  xfny jvgvyavor bpfymtyu v yubedecfl gclfsq xlnzbpfymt jqtdqwqndr  lpopttyg anxfo qndrqprwje opt ziqkjv ubedecflpo\n" +
                " qisyan prwj pfymty\n" +
                "tdqwqndrqp gfd fddjvg ty rjqtdqwq rwjeywrp lpo xfowrrj wqn rgclfsq xybxfnymg ty dqw flpo\n" +
                "rgclfsqis  djvgvyavo tdqwqn jeywrpa fow jvgvyav hxl jvntxy wrr cflp gf gvy jvntx fowrrjqt flpopttyg q vorg qw\n" +
                "z ywrp gfd bovkzi\n" +
                "bedecf rrjqt qn lnzbpfym\n" +
                "jeywrpa qprwje\n" +
                "orgc a wq\n" +
                "fowrr decflpopt eywrpab gclf\n" +
                "kziqkjvnt ovkziqkj  tdq x f bovkziqk qnd gv tdqwqndrqp popttygfd\n" +
                "gc bo ttyg tyubedecf qisya ya yub anxfowrr  rqprwj rgclfs drq pttygfddjv kjv\n" +
                "wrrjqtdqwq \n" +
                "orgcl\n" +
                "fymt ovkziq ubedecf jqtdqwqnd  clf isy jqtdqw jvg ymtyubede tdqwq qkjvnt gcl f\n" +
                "vyavorgcl edecf g\n" +
                " jvntxybx mty ab jvgvyavo lpo qwqndrqpr yb nym fn rqpr hxlnzbp abovkziqkj drqprwjey avo drqprwj isyan ttygfdd kjvnt\n" +
                "kziqkj tyub sya\n" +
                "ygf rwj flp op xfny rrjqtdqw qkjvn bedecflpop\n" +
                "bpfymty j g\n" +
                "wrrj  anxfo decfl tygfddjvg eyw ubedecfl fddjvgvy ya yanx \n" +
                "fddjvgvy\n" +
                " mtyub f rrj wqn prwje ubedecf\n" +
                "kziqkj tyu\n" +
                " qnd jqtdqwq rwjeywr iqkjvntxyb edecfl  rgclfs\n" +
                "nxfowrrj decflp iqkjvnt syanxfo lpo  vkziq vyavorgclf  fymtyube \n" +
                "qndrqprwj\n" +
                "dqwqnd\n" +
                "wrpab yw fowrrjqt vorg i qprwj ovkziqk ub qwq tyubedecfl fymtyub wrp tygfddjv p xlnzbpf ya xfow ovkziq gf\n" +
                "mtyubedecf wrpabovkzi wrrjqtdqwq vkziqkjv j\n" +
                "qprwjey wrrjqtdqw is nymg jqt pabov  rjqtdqwqnd rjqtdqwqnd edecflp qisya\n" +
                "eywr bxfnymgm pttygfddj gfddjvgv anx lfs eywrpabovk bovkzi anxf  lpoptty vntxybx bovkziq tygfd\n" +
                "xl mtyubedecf r pfymt ovkziq hxlnzbpfy pf ty djvg b orgclfs qndrqp rrjqtdq yanxfo \n" +
                "y opt ziqkjvntx  jvntx ddjvgvy vntxybxf q r syanx m i nymgm vntxybxf\n" +
                " gcl fowrrjqtdq lpopt ywrpa qprwjeyw p  rp pttygfd yavorgclf f wqndrqprw yw wrrjqtdqwq pfymt v lpop drqprw abov fymtyu orgclfsqi jq bo\n" +
                "p lnzb clfsqisya isyan ubedecfl sqisy tdqwqn ow rwjeywr ab wrr jeywrpabo  i\n" +
                "rgclfsq vkziqkjv\n" +
                "lnzbpfym nzbpfy \n" +
                "cflpoptt ya ybx vkz gvyavor gvyav t ed isyanxfow\n" +
                "fsqi tdqw ty abovk jqt f cflpopttyg qp fddjvgvya pabovkz fymty qwqnd b rp ziqkjvnt vgvyavor rpab ubedecflpo ovkzi\n" +
                "ddjvg an yavorgcl\n" +
                "syanxfowrr abovk owrrj jqt q  rrjqtdqw nxfowrrjq popttyg abovkziq txy o hxlnzb tty lpopttyg bed orgc qndrqpr bovkziqkj\n" +
                "mtyube\n" +
                "xlnzb ecflp qpr po j qn rgclfsqis  pr tyube  ymtyubede lpopttygf ygfddj tyubedec owrrjqtdqw qprwje bx ubedecflpo\n" +
                "ndrq g vgvyavo anxfow p fddjvgvy flpoptt gvyavorgcl wqn  mtyub qndr g rpab vyav  tyu fowrrjqtdq jvgvya xlnz edecflpop mgm rpabovkziq popttygf\n" +
                "rrjqtdqwqn ttygf xfnym wrpabovkz xlnzbp qpr qt gclfsq edecflpopt vntxybx y\n" +
                "cfl\n" +
                "ntxy jqt  wqndrqprw vntxybxfny f ziqkjvntxy   bedecfl fddjv gclfsqis djvg fymtyu fowr\n" +
                "o xfnym xlnzbpfy ttygfddjv orgcl vorgclfsqi xfo zi dr fs qndrqprwj vgvyavorg jvntxybxf ndr\n" +
                "avorg g b y s nd djvgvyav nxfowrrj wjeywrpa sy qprwj\n" +
                "rgclfsqis vorgc r ttygf ecflpopt ddjvgvyavo gf gfdd  syanxfowrr lnz xfnymg gc ov xfowrrjqtd qprwjeywrp c pabovkzi vyavorg r ttygfdd a pttygf yubedecf\n" +
                " abovkziqkj fymtyubed wrrjqt\n" +
                "jqtdqw qkjvnt rwjeyw sq wrrjqtdqwq nx zbpfymt\n" +
                "rr ddjvgvy \n" +
                "ndrqprwj  vntxybx d abovkziqk f  optt  nxfowrrjqt tdqwqnd\n" +
                "rpabovkzi  \n" +
                "nzbpf z xybxfn opttygfd  gfddjvg rg qwqndr sy ntx lfsqisyan ddjv yubedecf avorg pabov\n" +
                " pabovkziq iqkjv\n" +
                "qprwje isy gclfsqi o nzbpfymty fymtyu fowrrjqt ybxfn hxln pabovk cfl rwjeywrp vgvyavorg xfo fs\n" +
                "nd\n" +
                "lpo qwqndrq opt rjqtdqw clf ubedec abovkzi rpab n\n" +
                "ymty q k  yavorgc  jqtdqwqnd drqpr ln tygfd ovkziq anxf nzbpfy ln w po  t \n" +
                "cflpopt  txy ziqkjvnt y v ovkziq\n" +
                " ubedec i wrpab r wjeywrpabo kziqkj tygfdd yavor jeywrp tty p d fddjvgvyav qp m vya gvyavo clfsqis\n" +
                "hxln avorgcl  jvg eywrpabov jqtdqwq   qisya tyubedec vntxybxfny\n" +
                "xlnzbp   yan rqprwjey flpopttyg gvy bovkziqkj pabovk vgvyavor k\n" +
                "dqw fddjvgv ed  cflpopttyg bedecflpo lfs ecf bov\n" +
                "gvyavo rrjqtd tx yavorgclf ubedecfl yav fowrrjqtdq txybxfnymg\n" +
                "optty wqndrqpr jeywr\n" +
                "yavorgc abovkz ybxf djvgvyav sqis gfddjvg c isyanxfow txybxfny ygfddj \n" +
                "jvntxybx tygfddjv   popttygfd ed qndrqp\n" +
                "bxfny gfd qwqn\n" +
                "x xfnymg q prwjeywr fsqisyanxf xfowrrjqtd g pabovkz fowr ttygfddj rrjqtd  k ziqkjvnt zi ywrp zbpfym y jvntxyb jv xfnym cflpopt ttygfddjvg ywrpa\n" +
                "sqisyanxf pfymtyub jeywrp ecflp\n" +
                "fnymg qprwj\n" +
                "t x rqp fsq yu wqndrq lpopttygf jqtd vkziqkj ecfl flpopt orgcl o je l  ymtyubed jqtd tygf\n" +
                "ntxybxf clfsq ddjvgvy\n" +
                "lfsqi yb qtdq cflpoptt txyb\n" +
                "wrr pttygfddjv\n" +
                "pfymtyubed y ubedecflpo optt nxfowrrjq\n" +
                "bedecflp  prwjey   edecflpopt sqisya abov orgclfsqi yubedecflp ywrpabov qis vntxybxfny xfnym d gfddjvgvya syanx fn dqwq ybxfn i gclfsqisya jv yan\n" +
                " rp nzbpf\n" +
                "rjq abovkziq \n" +
                " ecflpo\n" +
                "xy bovkziqkj rwjeyw fnymg\n" +
                "jey ntxy\n" +
                "xlnzbp pabo orgcl ygfddjvg abovkziqk\n" +
                "fowrrjq  rgclfsqis  ovkziqkj  yanxfowr  ecflpoptt fddjvgvyav lnzbpfymty\n" +
                "anxfowr anxf\n" +
                "txy nym tx ybxfnym rgclfsqis wjeywrpab vgvyav\n" +
                "org abovk poptty qwqndrqpr opttygfd\n" +
                "orgclfs ntxybxfn tty xyb ndrqpr d gclfsq gclf  zbpfymt tygf r sqisyanxfo tyube k ttygfddjv rjqtdqwqnd vntxybxfn tygfdd ttygfd qwqndrqp iqkjvntxy d f\n" +
                "sya ow de\n" +
                "fymtyubede ntxybxfnym rjqt p yavorgc djvgvyavor sqisy sya ddjvgvyavo mtyu bovkziqkj  n  ty lnzbpfy nzbp isyanxfowr pfymtyub fowrrj qtdqwq owrrjqtdq ecflpop anxfo\n" +
                "xfnymg gclfs\n" +
                " ybx qndrqprw qisyanxf w jqtdqwqnd vnt mtyubedecf clfsqi  ntx isya iqkj hxlnzbpfy vkziq fsqisyanx  dqw ovkziqkjv r nt wrrjqtdqwq kzi ymtyub\n" +
                "iq prwj yubedecflp ecflpop y\n" +
                "bo yubedecfl  o  bovkziqkj clfs tyubedecfl rwjeywrp qndrqprw pttygfd txybxfnymg ubedecf pabovkzi tyubede drqprwj wrrjqtdq edecflpop ttygfddj qkjvntxy vgv xybxfnym ecflpoptt rgclfsq\n" +
                "ndrqpr kjvntxybx qpr\n" +
                "  lnzbpfymt ddjvgvya rwjeywrpab ziqkjvn ttyg yavorg  mtyubedec fsqis vorg fnym xlnzbpfymt\n" +
                "is popttyg zbpfymtyu\n" +
                "abovkziq vyavorg rjqtdqwq\n" +
                "wrrjqtdq\n" +
                "jqtdqwqnd tyubedecfl v\n" +
                "ziqkjvnt\n" +
                "bpf vntxybxf xfowrrjqtd\n" +
                "vkziq ede  lpo \n" +
                "mtyubedecf fdd ovkziq  prwje\n" +
                "wjeywrp\n" +
                "iqkjvntxyb orgclfsqis xfowrrj \n" +
                "wrrjqtdqwq qprw ovkz ybxfn y gcl qisyanxfow\n" +
                "ybxfn\n" +
                "lpopttyg ym fymtyu clfsqisy ymty pttygfddjv  bpfymt r isy bovk vn vkziqkjv lpop rjqt zbp gfddjvgv fsqisyan ecf\n" +
                "vgvyavorg qtdqw\n" +
                "decfl vorgclf hxlnzbp qndrqpr edecf qkjvntxybx yanxfowr  gfddjvg ny n j  wje\n" +
                "pt pfymt fymtyubede flpo rjqtdqw rgcl wr pttygfddj xfow qkjvn rpabo\n" +
                "txybxfnym pttygf m pa vo f lnzbpfym pop i pabovkzi  qwqndrqp drqprw isyanxfo prwjeywrpa f djv jvgvyavorg prwjeyw\n" +
                "orgc lnzbpfym xybx \n" +
                "rgclfsq ya syanxfow lfsqisya ndrqpr fsqisyanxf vyav kziqkjvnt wrpa rpabov rqprwj\n" +
                "fo wrrjqtdq b\n" +
                " tygfddjv yubedecflp ttygfdd vkzi djv cf bovkz wrr  hxlnz clfsqi vorgclfsqi xfowrr iqkjvntx abov fddjvgvy orgc sqisya yan drqprwjeyw rg rrj lfsqisya\n" +
                "txybxf kziqkjv ziqkjvntxy  bedecfl qisyanx opttygfdd bovkz o\n" +
                "gvyavorgc popttygf ziqkjvnt\n" +
                "nymg decf vorgclf  isyan\n" +
                "drqprwjey qkj xlnz t decflpo  gvyavorgcl dqwq\n" +
                "l prwjey tygfddj qtdqwqnd\n" +
                "bede wrrjq qprwjeywrp u fsqis t  ya rpabo q qisyanx qprw djvgvyavo s xlnzbpfymt orgclf f vgvyavor j ttygfddj bedecf t qwqnd \n" +
                "bovkziq rqprwj qndrqprw be vgvy\n" +
                "ty  lfsqisy fn o bovkz nt\n" +
                " gc kjvntx fd nd\n" +
                "qnd rwjeywrp prwjey pfymtyube yavorgclf\n" +
                "bedecflp bedecfl qprwjey lf j\n" +
                "ttygf rwjeywrp vn yanxfowrr clfsq rjqtd t l fowrrjqtdq rrjqtdqwqn rqpr hxl gvya wqn\n" +
                "vkziqkjvn\n" +
                "sq lnzbpf\n" +
                "t ecflpoptty avorgc vgvyavor jvgvy dqwq owrrjqtdqw txybxfnym\n" +
                "ovkziqk wrpa an xybxfny qtdqw  djvg tdqwqndr  ecflpopt kjvntx\n" +
                "rq hxlnzbpf x ybx\n" +
                "popttygfd pfymtyube\n" +
                "fym vnt tyu clfsqisyan  pttygfd f wqndrq k  qisyanxf yubede jey a sqis o yu syanxfow n z lfs kjvntxyb fy wje\n" +
                "edecflpop ziqkjv m a  mtyube qtdqwqndr bovkzi rwj  isyanxfowr hxlnzbp owrrjqtdq djv\n" +
                "ndrqprw fddjv  q gfd s mtyu sqisyanxfo drqprwjey w j qp nxfowrrjqt owrrjqtdq kziqkjvntx vorgcl pabovkziqk avorg vgvyavorgc\n" +
                "fymtyubede\n" +
                "gcl  isyanxfow\n" +
                "ptt wjeywr tdqwqnd rwje  edecflpo pabovkzi f txybxfny n edecfl nzbpfymtyu ntx opttygfddj xl popt  pabovkziq  k qndrqp abovkz yavorg tygfddjvgv\n" +
                "nzbpfymty tyubed vkziqkjvnt\n" +
                "zb vo  td\n" +
                " decflp wjeywrpabo\n" +
                "jeywrpabov\n" +
                "prwje ybx   kjvntxyb vkziq qn ndrqprwjey qprw\n" +
                "ymt f mtyubedecf isyanxfo\n" +
                "qisy o bede drqprwjey\n" +
                "zbpfym rg gv qwqndr wrrjqtdqwq flpoptty jvntxybxf\n" +
                "qp pttyg prwj dqwqnd ptty zbpfymty v \n" +
                "tyubedec ntxybxfny lnzb eywrpab fymtyubed\n" +
                "djvgvy clfsqis ttygf mgm\n" +
                "gvyavor  fnym a jeywrpa hxlnzbpfym gvyavor  j cflpop txybxfny\n" +
                "jvntx vor ecflp vkziqkj owrrjqtdq x rjqtdq isyanxf tygfddjvg r nzbpfymty ovk hxln bxfnym eywrpabovk gfddjvgvya rqprwjeywr sqisya t hxlnzbpf rrjqtdqw fsqisyanxf lpoptty isy\n" +
                " pfymty lf\n" +
                "prw rpab  edecflpop\n" +
                " eyw opttygfddj isyan\n" +
                "vg ubed \n" +
                "decflpo flp popttygfdd fsqisyan ya d fddjvgv wjeywrpabo fsqisya vntxybxf sy\n" +
                " bp  rqprwjey bxfn ey  fnymgm bovkziqkj\n" +
                "vgv t vorgclfs m bovkz ndrqprwjey fsqis i ziqkjvntx q rpab\n" +
                "zbpf nzbpfymtyu lnzbpfymty eywrpa l xfnymgm pfymtyubed abo cflpopttyg yubedec ttygfd yu  isyanxfow\n" +
                " pop rpabov qkjvntxy\n" +
                "v vorg\n" +
                " wrpabovkzi gcl  vorgc rwjey ovkziq decflpoptt ov sqisyanxfo vkziq wrrjqtd td jvgvyav \n" +
                "ymg orgclf syanx djvgvyav ymty ab wqndr avorgcl jqtdq bxfnymg gclfsqisya ymty rjqtdqwqnd bpf isya fnymgm ovkziqk nxfowrrjqt drqprwje djvg wqnd tdqwqndrqp qp \n" +
                "gv vntx anxfowrrjq bpf tyubedec t rrjqtdqwqn dqwqndrq xfowrrjq o gclfsq\n" +
                "anxfowr edecfl vntxy fsqis xybxfnymgm gclfsqi rqprwjeyw popt popttygf\n" +
                "fl rwjey lnzbpfym\n" +
                "vorgcl vyavo yubede tdqwqn\n" +
                "b sqi\n" +
                "pop jvntxybxfn ymtyubede\n" +
                "kjvntxybxf vntxybx qi y ywrpabo owrrjqt tyubedecf\n" +
                "wqndrqprwj  ymtyub\n" +
                "fddj ndrqpr rwjeywrpab lnzbpfymt eywrpab ymtyubede jeywrpabo\n" +
                "cflpoptt ybxfny ygfd txybxfnymg bed anxfo ybx\n" +
                "ziqkjvn\n" +
                "vyavorgc  gvy\n" +
                "rqprwjeyw\n" +
                "bpf bpfymtyu jqtdq  vgvya iqkjvntx fo flpopt qkjvntxy jeywrpab bxfnymg opttygfd tdq rg \n" +
                "ziqkjv lpoptt  vya zbp pttygfd abovkziqkj q kjv\n" +
                "decflpopt rjqt sqisyan nzbpf vntxybxfn\n" +
                "rgcl abovk ymt lnzbpfym  kj yan anxfow l r rpabovkziq\n" +
                "ecflpopt ywrpabov yanxfowr avo anxfowr ddjvgvyav kzi ymtyube sqi vntxybxfny ygfddjvgv ovkziq ndrqprw fowrrj\n" +
                " bedecf bovkz wrrjq\n" +
                "lfsq yav  rqpr vyavorgclf j prwjeywr lfsqi \n" +
                "djvgvyavo yavorg djvgvyav ttygfd vntxyb fsqisy ygfddj ecflpo  qisyanx qtd lfsqisy lnzbp fym\n" +
                "clfsq vgvya gfddjvgvya ubedec fsqis xfowrr poptty\n" +
                "wjey vntxybxf\n" +
                "qwqndrq j avorgcl\n" +
                "cflpopt nxfowrr jvntxybxf\n" +
                "gclf\n" +
                "txybx abovkz abovkziqk lnz vorgcl fdd i qndrqprwje vgvya rgcl ubedecflpo bxfnymg wjey nym xybxfn n isyanxf qtdqw bo gclfsqi qn qpr  tyu\n" +
                "txybxfn prwje lnzbpfy  fsqi cflpoptty y xybxfnym rgcl pfymtyu eywrpabo drqprw abov clfsq ntxybxfn nz  nymg mtyubedec\n" +
                "yb opttygf tyubedecfl drq txybxfn\n" +
                "jvgvyavo lpoptt\n" +
                "decf bpfymt pfymtyubed xlnzbpfym ndr  e abo zbpf vorg g rjqtdqwqn i kjvntx avorg qwq jqtdqwqndr flpop fo\n" +
                "ecf owrrjq\n" +
                "vgvyavorg syanxfowrr owrrjqt\n" +
                "gvyavorg cf fnym\n" +
                "wqndrqprw\n" +
                "yw jvn pfymty\n" +
                "edecflpo ecflp qprwjeywr\n" +
                "jvntx lnzbpfymty ed kj qndrqprwj flpoptt prwjeyw\n" +
                "p wrrjqtdqwq lnzbpfym\n" +
                "jqt \n" +
                "ddjvgvyav\n" +
                "popttygf wrpabo jvgvyavorg ddjvgvya\n" +
                "yu  iqkjv lpopttygf\n" +
                " djv opttyg dqwqndrqp orgcl\n" +
                "fow   xlnzbpfymt yubedecflp is kjvntxy sya jqt syanxfo  eywrpa drqp bed\n" +
                "lnzbp  anxfo\n" +
                "pr kjvntxybx rgclfsqi orgc jvgvyav qisya yavorgcl prwjey v gv syanxfow nxfow kzi wrpabo mtyub\n" +
                "pabovkz  yanxfo wjeywrpabo drqp\n" +
                "ymtyu fymt clfsqisy qkjvn fddjv wjeywrpa mtyu fddjvgv  opttygf fsqisy kjvntxyb  flpop vkziqkjv fowr  zb tdqw\n" +
                "ubedecf\n" +
                "qw  pabov\n" +
                "lfsqisya qkjv  ptty\n" +
                "h dqwq hxlnzb ym xfnym xlnzbpfymt  jvgv iqkjv yanxf syanxf hxlnzbp optt kziqk pfymtyu\n" +
                " vkz ecflpoptty l fddjvgv qndrqp ymtyubede fsq isyanxfowr  opt cl lfsqisyanx owr"));
    }
}
