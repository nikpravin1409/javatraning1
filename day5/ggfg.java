contract CFutures { address user; address hedger; address speculator; struct asset{
uint id;
uint Quantity; uint price; address seller; address buyer; uint date;
}
asset TradedAsset;
event DepositEv(uint amount, address sender); function CFutures(
uint assetID, uint Quantity, uint price, address buyer, address seller,
uint date) public { TradedAsset.id = assetID; TradedAsset.Quantity = Quantity; TradedAsset.price = price; TradedAsset.seller = seller; speculator = seller;
hedger = buyer; TradedAsset.buyer = buyer; TradedAsset.date = date;
}

function deposit() public payable returns(bool) {
require(msg.value == TradedAsset.Quantity * TradedAsset.price); DepositEv(msg.value,msg.sender);
return true;
}

modifier onlyhedger() { require(msg.sender == hedger);
_;
}

function sellcontract(address newhedger) public onlyhedger returns(bool){

hedger = newhedger; return true;
}

function getpaid() public returns(bool){
require(now >= TradedAsset.date && address(this).balance > 0); speculator.transfer(address(this).balance);
return true;
}
}